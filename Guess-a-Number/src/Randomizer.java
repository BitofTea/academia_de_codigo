public class Randomizer {

    public static int getInt(int max){
        return getInt(0, max);
    }

    public static int getInt(int min, int max){
        //int range = (max - min) + 1; ?
        return (int) (Math.random() * (max - min)) + min;
    }
}

