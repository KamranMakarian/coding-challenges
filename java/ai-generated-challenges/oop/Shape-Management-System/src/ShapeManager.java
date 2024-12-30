import java.util.ArrayList;

public class ShapeManager {

    private ArrayList<Shape> shapes;

    public ShapeManager() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void displayAllShapes(){
        for (Shape shape: shapes){
            shape.displayInfo();
            System.out.println();
        }
    }

    public void resizeAllShapes(double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(factor);
            }
        }
    }
}
