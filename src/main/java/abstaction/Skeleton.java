package abstaction;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Skeleton extends NPC {

    private int arrows;

    public Skeleton(String name, int strength, int healthPoints, int arrows) {
        super(name, strength, healthPoints);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void shoot() {
        if (arrows <= 0) {
            System.out.println(getName() + " have no more arrows!");

            return;
        }

        System.out.println(getName() + " shot an arrow! Only " + --arrows + " left!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacked you with his bone arm!");
    }
}
