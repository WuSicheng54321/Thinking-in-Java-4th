
import java.util.Arrays;
import java.util.List;

abstract class Shape{
	void draw(){
		System.out.println(this+".draw()");
	}
	abstract public String toString();
	public static boolean rotate(Shape shape){
		if(shape instanceof Circle){
			return true;
		}else{
			return false;
		}
	}
}
class Circle extends Shape{
	public String toString(){
		return "Circle";
	}
}
class Square extends Shape{
	public String toString(){
		return "Square";
	}
}
class Triangle extends Shape{
	public String toString(){
		return "Triangle";
	}
}
class Rhomboid extends Shape{
	public String toString(){
		return "Rhomboid";
	}
}
public class Shapes {
	public static void main(String args[]){
		List<Shape> shapeList=Arrays.asList(new Circle(),new Square(),new Triangle());
		Shape s=new Rhomboid();
		if(s instanceof Circle){
			Circle r=(Circle) s;
		}
		s.draw();
		for(Shape shape:shapeList){
			shape.draw();
		}
	}
}
