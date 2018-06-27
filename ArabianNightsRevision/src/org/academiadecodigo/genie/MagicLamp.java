package org.academiadecodigo.genie;

//Releases a new genie every time is rubbed
//When enchanted(instantiated), maximum number genies is set
//Genies can be friendly(even) or Grumpy(odd)
//When number of genies is exhausted, release a recyclable demon
//Has the ability to recyclable a demon nd recharge itself
//We can compare the lamps by their capacity,
//number of remaining genies and number of times it has been recycled


public class MagicLamp {


    public int maxGenies;
    public int releasedGenies;
    public int recycledGenies;
    public int friendlyGenies = 0;
    public int grumpyGenies = 1;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
    }


    public boolean releaseGenies() {

        for (int i = 0; i < maxGenies; i++) {

            if (maxGenies == new Genie(){
        }


    }


    public int getLampsCappacity(int maxGenies) {



    }

    }

    public void setMaxGenies(int maxGenies) {
        this.maxGenies = maxGenies;
    }


    public void setFriendlyGenies(int friendlyGenies) {
        this.friendlyGenies = friendlyGenies;
    }

    public void setGrumpyGenies(int grumpyGenies) {
        this.grumpyGenies = grumpyGenies;
    }


