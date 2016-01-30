public class GreenhouseController extends GreenhouseControls {
	private boolean water=false;
	public class PumpOn extends Event{
		public PumpOn(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		public void action(){
			water=true;
		}
		public String toString(){
			return "PumpOn";
		}
	}
	public class PumpOff extends Event{
		public PumpOff(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}
		public void action(){
			water=false;
		}
		public String toString(){
			return "PumpOff";
		}
	}
	public static void main(String args[]){
		GreenhouseController gc=new GreenhouseController();
		gc.addEvent(gc.new Bell(1000));
		Event[] e={
				gc.new PumpOn(400),
				gc.new PumpOff(500),
		};
		if(args.length==1){
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}

