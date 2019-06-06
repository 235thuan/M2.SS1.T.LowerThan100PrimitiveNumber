public class LowerThan100PrimitiveNumber {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int number = 100;
        for (; i < number; i++) {
            boolean isPrime = true;
            if (count < 2) isPrime = false;
            for (int j = 2; j <= Math.sqrt(count); j++) {
                if (count % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(count + " ");
                i++;
            }
            count++;
        }




//        int limit = 100;
//        int[] array;
//        array = new int[limit];
//        for (int i = 2; i < limit; i++) {
//            array[i] = i;
//            boolean check =true;
//            int squareRoot=(int) Math.round(Math.sqrt(i));
//            int j = 2;
//            while (j <= squareRoot ) {
//                if (i%j==0) {
//                    check = false;
//                    break;
//                }
//                j++;
//            }
//            if(check) {
//                System.out.print(array[i] + " ");
//            }
//        }
    }
}
