public class Rectangle extends Shape implements Resizable{
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Default Color");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    @Override
    public void resize(double factor){
        this.length *= factor;
        this.width *= factor;
    }

}
