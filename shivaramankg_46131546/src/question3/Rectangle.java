package question3;
class Rectangle extends Shapes {
	    private double length, breadth;

	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    double area() {
	        return length * breadth;
	    } 
	    public String toString() {
	        return "Rectanglebreadth=" + breadth + "  Rectanglelength=" + length + "   CircleArea=" + area() ;
	    }  
}
