package org.academiadecodigo.genie;

//Releases a new genie every time is rubbed
//When enchanted(instantiated), maximum number genies is set
//Genies can be friendly(even) or Grumpy(odd)
//When number of genies is exhausted, release a recyclable demon
//Has the ability to recycle a demon and recharge itself
//We can compare the lamps by their capacity,
//number of remaining genies and number of times it has been recycled


public class MagicLamp {

    private static final int MAX_WISHES = 3;
    private int maxGenies;
    private int releasedGenies;
    private int recycledTimes;


    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        releasedGenies = 0;
        recycledTimes = 0;
    }


    public Genie rub() {

        if (releasedGenies >= maxGenies) {
            System.out.println("New Recyclable Demon");
            return new RecyclableDemon(MAX_WISHES);

        }

        releasedGenies++;

        if (releasedGenies % 2 == 0) {
            System.out.println("New Happy Genie");
            return new HappyGenie(MAX_WISHES);

        }

        System.out.println("New Grumpy Genie");
        return new GrumpyGenie(MAX_WISHES);
    }


    public void recycle(Genie genie) {

        if (!(genie instanceof RecyclableDemon)) {
            System.out.println("I can only recycle with Recyclable Demons");
            return;
        }
        recycledTimes++;
        releasedGenies = 0;
        System.out.println("I've been recycled");
    }


    public boolean compare(MagicLamp magicLamp) {

        return maxGenies == magicLamp.maxGenies &&
                releasedGenies == magicLamp.releasedGenies &&
                recycledTimes == magicLamp.recycledTimes;

    }
}


