public class GreenhouseControls extends Controller{
	private boolean light=false;
	public class LightOn extends Event{
		public LightOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			light=true;
		}
		public String toString(){
			return "Light On";
		}
	}
	public class LightOff extends Event{
		public LightOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			light=false;
		}
		public String toString(){
			return "Light Off";
		}
	}
	private boolean water=false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			light=true;
		}
		public String toString(){
			return "Water On";
		}
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			light=false;
		}
		public String toString(){
			return "Water Off";
		}
	}
	private String thermostat="Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		public void action(){
			thermostat="Night";
		}
		public String toString(){
			return "Night";
		}
	}
	private boolean fan=false;
	public class FanOn extends Event{
		public FanOn(long delayTime) {
			super(delayTime);
		}
		public void action(){
			fan=true;
		}
		public String toString(){
			return "fanOn";
		}
	}
	public class FanOff extends Event{
		public FanOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			fan=false;
		}
		public String toString(){
			return "fanOff";
		}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}
		public void action(){
			thermostat="Day";
		}
		public String toString(){
			return "Day";
		}
	}
	public class Bell extends Event{
		public Bell(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		public void action(){
			addEvent(new Bell(delayTime));
		}
		public String toString(){
			return "Bell!";
		}
	}
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime,Event[] eventList){
			super(delayTime);
			this.eventList=eventList;
			for(Event e:eventList){
				addEvent(e);
			}
		}
		public void action(){
			for(Event e:eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		public String toString(){
			return "Restarting system";
		}
	}
	public static class Terminate extends Event{
		public Terminate(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		public void action(){
			System.exit(0);
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Terminating";
		}
	}
	public static void main(String args[]){
		GreenhouseControls gc=new GreenhouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList={
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new FanOn(1000),
				gc.new FanOff(3000),
				gc.new ThermostatDay(1400),
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length==1){
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}
