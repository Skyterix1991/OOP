package polymorphism;

public class Div {

    private double width;

    private double height;

    public Div(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Div(String width, String height) {
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setWidth(String width) {
        this.width = Double.parseDouble(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHeight(String height) {
        this.height = Double.parseDouble(height);
    }

    public void printName() {
        System.out.println("Hey, my name is div!");
    }
}
