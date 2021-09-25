package question3;

public class Shapesmain {
	    public static void main(String[] args) {
	        ShapesFactory s = new ShapesFactory();
	        s.addShape(new Circle(90.2));
	        s.addShape(new Rectangle(37.2, 29));
	        s.addShape(new Rectangle(22, 10));
	        Rectangle r = new Rectangle(12.2, 54);
	        s.addShape(r);

	        System.out.println(s.Circles());
	        System.out.println(s.Rectangles());
	        System.out.println(s.deleteShape(r));
	        System.out.println(s.Rectangles());

	    }
}
