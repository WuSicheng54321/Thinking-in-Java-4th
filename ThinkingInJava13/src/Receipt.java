import java.util.Formatter;

public class Receipt {
	private double total=0;
	private int i=15;
	private Formatter f=new Formatter(System.out);
	public void printTitle(){
		f.format("%-"+i+"s %"+i+"s %"+i+"s\n","Item","Oty","Price");
		f.format("%-"+i+"s %"+i+"s %"+i+"s\n", "----","----","----");
	}
	public void print(String name,int qty,double price){
		f.format("%-"+i+"s %"+i+"d %"+i+"f\n", name,qty,price);
		total+=price;
	}
	public void printTotal(){
		f.format("%-"+i+"s %"+i+"s %"+i+"f\n", "Tax"," ",total*0.06);
		f.format("%-"+i+"s %"+i+"s %"+i+"s\n", "","","----");
		f.format("%-"+i+"s %"+i+"s %"+i+"f\n", "Total","",total*1.06);
	}
	public static void main(String args[]){
		Receipt receipt=new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Bean", 4, 4.25);
		receipt.print("Princess", 3, 5.1);
		receipt.print("Three Bears Porridae", 1, 14.29 );
		receipt.printTotal();
	}
}
