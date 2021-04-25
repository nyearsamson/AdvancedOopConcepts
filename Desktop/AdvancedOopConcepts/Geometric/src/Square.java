

public class Square extends GeometricFigure {
    Square(int height, int width, String type){
        super(height, width, type);
    }

    @Override    public double getArea() {
        return (super.getHeight() * super.getWidth());
    }

    @Override    public String toString() {
        return "The " + super.getType() + " with height = " + super.getHeight() + " and with width = " + super.getWidth() + " has an area of " + this.getArea();
    }
}

