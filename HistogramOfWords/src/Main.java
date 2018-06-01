public class Main {

    public static void main(String[] args) {

        MapE map = new MapE("gabi gabi rudy");
        for (String p : map) {

            System.out.println(p + " " + map.get(p));

        }
    }
}