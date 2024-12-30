public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Default Color");
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double factor){
        this.radius *= factor;
    }
}

