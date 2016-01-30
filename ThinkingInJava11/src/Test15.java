import java.util.Arrays;
import java.util.Stack;

public class Test15 {
	    public static void main(String[] args) 
	    {   
	        String[] c;
	        String s="+U+n+c---+c+r+t---+a-+i-+n+t+y---+--r+u--+c+e+s---+I+ +l+o+v+e+ +l+i+f+e";
	        c=s.split(""); 
	        Stack<String> sd=new Stack<String>();
	        for(int i=0; i<c.length; i++){
	            if(c[i].equals("+")){
	                 i++;
	                 if(!(c[i].equals("+"))&&!(c[i].equals("-")))
	                     sd.push(c[i]);  
	            }
	            if(c[i].equals("-")){
	                if(!sd.empty()){
	                  System.out.print(sd.pop());
	                }
	            }
	        }
	        System.out.println(sd);
	    }
}
