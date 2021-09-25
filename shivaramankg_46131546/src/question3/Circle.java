package question3;

class Circle extends Shapes {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    double area() {
	        return Math.PI * radius * radius;
	    }
	    public String toString() {
	        return "Circleradius" + radius + "   CircleArea=" + area();
	    }

	  
	}

