public class closestneighbour{


public static void main(String[] args) {

    int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
    int[] result = findClosest(myArray);
    // print the elements of the resulting array
}

private static int[] findClosest(int[] numbers) {
    // hint: remember Math.abs();
int[] resutado = new int[2];

int difInicial = Math.abs(numbers[0] - numbers[1]);

for (int i=1; i<=numbers.length-2; i++ ){
    if(difInicial>Math.abs(numbers[i]-numbers[i+1])){
        difInicial = Math.abs(numbers[i]-numbers[i+1]);
    }
    else{
        //System.out.println(numbers[i]);
        //System.out.println(numbers[i+1]);
        resutado[0]=numbers[i];
        resutado[1]=numbers[i-1];
    }

}
System.out.println(resutado[0]);
System.out.println(resutado[1]);
return resutado;
}
}