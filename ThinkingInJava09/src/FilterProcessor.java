import filter.BandPass;
import filter.Filter;
import filter.HighPass;
import filter.LowPass;
import filter.Waveform;

class FilterAdapter implements Process{
	Filter filter;
	public FilterAdapter(Filter filter) {
		// TODO Auto-generated constructor stub
		this.filter=filter;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}
	
}
public class FilterProcessor {
	public static void main(String args[]){
		Waveform w=new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
