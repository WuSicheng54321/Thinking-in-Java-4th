import java.util.Random;

class Shape{
	public void draw(){}
	public void erase(){}
	public void print(){
		System.out.println("this is information in the shape");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Circle.draw()");
	}
	public void erase(){
		System.out.println("Circle.erase()");
	}
	public void print(){
		System.out.println("this is information in the Circle");
	}
}
class Square extends Shape{
	public void draw(){
		System.out.println("Square.draw()");
	}
	public void erase(){
		System.out.println("Square.erase()");
	}
}
/**
 * @Override
 * @author Administrator
 *
 */
class Triangle extends Shape{
	public void draw(){
		System.out.println("Triangle.draw()");
	}
	public void erase(){
		System.out.println("Triangle.erase()");
	}
}
class Star extends Shape{
	public void draw(){
		System.out.println("Star.draw()");
	}
	public void erase(){
		System.out.println("Star.erase()");
	}
}
class RandomShapeGenerator{
	private Random rand=new Random(50);
	public Shape next(){
		switch(rand.nextInt(4)){
			default:
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
			case 3:return new Star();
		}
	}
}
public class Shapes {
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String args[]){
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++){
			s[i]=gen.next();
		}
		for(Shape shp:s){
			shp.draw();
			System.out.println("----------------");
			shp.print();
		}
	}
}
