package polymorphism;

public class Container extends Div {

    private final String[] classes = new String[] {
            "container"
    };

    public Container(double width, double height) {
        super(width, height);
    }

    public Container(String width, String height) {
        super(width, height);
    }

    @Override
    public void printName() {
        System.out.println("Hey, my name is container!");
    }
}
