public class MissinChar{

  public static void main(String[] args) {

    missingChar("Robocop", 3);

    //receive command line argument if available
    if(args.length>=2){
	    missingChar(args[0], Integer.parseInt(args[1]));
    }
}

private static void missingChar(String str, int n) {

  char ch = str.charAt (3);
    System.out.println(ch);

  String A = str.substring(0,n);
    System.out.println(A);

  String B = str.substring(n + 1); // print result here
    System.out.println(B);

    System.out.println(A + B);

}
}
