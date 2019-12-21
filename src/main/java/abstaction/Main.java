package abstaction;

public class Main {

    public static void main(String[] args) {

        NPC npc = new Skeleton("Skelly", 10, 100, 3);
        Skeleton skeleton = new Skeleton("Skelly v2", 10, 100, 3);

        /*
            The first thing we can notice is that both objects have attack() which was not possible in simple inheritance example.
            Both methods will return the same value.
            Java automatically knows that it should use the overridden method code.
         */

        npc.attack();
        skeleton.attack();

        /*
           For the methods exclusive to skeleton NPC does not have access to them.
           Cannot use method npc.shoot()
         */
        skeleton.shoot();

    }

}
