package inheritance;

public class Main {

    public static void main(String[] args) {
        /*
           No skelly.shoot() method!
           If an object is stored in its extending class, it loses its own methods.
         */
        NPC skelly = new Skeleton("Skelly", 10, 100, 5);

        /*
           There is no problem for it to be cast back.
         */
        ((Skeleton) skelly).shoot();

        /*
           Methods from extended class are accessible.
         */
        skelly.attack();
    }

}
