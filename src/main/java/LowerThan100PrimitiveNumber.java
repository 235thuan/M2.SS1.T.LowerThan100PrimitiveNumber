import java.util.Scanner;

public class LowerThan100PrimitiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 100;
        int[] array = {};
        array = new int[limit];
        for (int i = 2; i < limit; i++) {
            array[i] = i;
            boolean check =true;
            int squareRoot=(int) Math.round(Math.sqrt(i));
            int j = 2;
            while (j <= squareRoot ) {
                if (i%j==0) {
                    check = false;
                    break;
                }
                j++;
            }
            if(check)
            System.out.print(array[i]+" ");
        }
    }
}
