package polymorphism;

public class Main {

    public static void main(String[] args) {
        /*
            The objects are going to have the same values, even though they are not the same type.
            It's done by using polymorphism in the constructor.
            The constructor can handle different types of data differently, but in the end, it can give the same result.
         */
        Div div1 = new Div("10", "20");
        Div div2 = new Div(10, 20);

        System.out.println(div1.getHeight());
        System.out.println(div2.getWidth());

        // Same thing can be used in methods
        div1.setHeight(10);
        div2.setHeight("20");

        System.out.println(div1.getHeight());
        System.out.println(div2.getWidth());

        /*
            The different type of polymorphism can be observed below.
            Container extends div, but the same method gives two different results.
            It's done by creating an overriding method which can override the existing function code of parent class.
         */
        Container container = new Container("10", "20");
        div1.printName();
        container.printName();
    }

}
