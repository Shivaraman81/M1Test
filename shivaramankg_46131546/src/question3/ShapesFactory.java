package question3;
import java.util.ArrayList;
import java.util.List;
class ShapesFactory {
    ArrayList<Shapes> list = new ArrayList<>(); 

    public ShapesFactory() {
    }

    public void addShape(Shapes s) {
        list.add(s);
    }

    public List<Circle> Circles() {
        ArrayList<Circle> circle = new ArrayList<>();
        for (Shapes s : list) {
            if (s instanceof Circle)
                circle.add((Circle) s);
        }
        return circle;
    }

    public List<Rectangle> Rectangles() {
        ArrayList<Rectangle> rectangle = new ArrayList<>();
        for (Shapes s : list) {
            if (s instanceof Rectangle)
                rectangle.add((Rectangle) s);
        }  
        return rectangle;

    }

    public boolean deleteShape(Shapes s) {
        if (list.contains(s)) {
            list.remove(s);
            return true;
        }
        return false;
    }
}
