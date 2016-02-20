package firth.five;

import java.util.*;
import java.util.Queue;
import java.util.Random;

import Test08.Generator;

class Customer{
	private static long counter=1;
	private final long id=counter++;
	private Customer(){}
	public String toString(){
		return "Customer" +id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			public Customer next(){
				return new Customer();
			}
		};
	}
}
class Teller{
	private static long counter=1;
	private final long id=counter++;
	private Teller(){}
	public String toString(){
		return "Teller "+id;
	}
	public static Generator<Teller> genertor=new Generator<Teller>() {
		public Teller next(){
			return new Teller();
		}
	};
}
public class BankTeller {
	public static void serve(Teller t,Customer c){
		System.out.println(t+" serves "+c);
	}
	public static void main(String args[]){
		Random rand=new Random(47);
		Queue<Customer> line=new LinkedList<>();
		Generators.fill(line, Customer.generator(),15);
		List<Teller> tellers=new ArrayList<>();
		Generators.fill(tellers, Teller.genertor, 4);
		for(Customer c:line){
			serve(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}
}
