package abstractdemo;

public class AbstractClassExample1 {

	public static void main(String[] args) {
      Shape circle = new Circle(5.2);
     
      System.out.println("circle of Area:"+circle.area());
      System.out.println("Circle of Perimeter:"+circle.perimeter());
      
      Shape rectangle = new Rectangle(10.5, 5.2);
      System.out.println("Rectangle of Area:"+rectangle.area());
      System.out.println("Rectangle of perimeter:"+rectangle.perimeter());
    		  
      
	}

}
