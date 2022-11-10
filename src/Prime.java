import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        boolean isPrime = true;

        for (int i = 0; i < 100; i++) {
            if (i < 2) {
                continue;
            }else if (i == 2) {
                arrayList.add(i);
            }else if (i % 2 == 0) {
                continue;
            } else {
                if(isPrimeNumber(i)) {
                    arrayList.add(i);
                }
            }
        }
        for (int i = 0; i < arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }
    }

    private static boolean isPrimeNumber(int num) {
        int squareRoot = (int) Math.sqrt(num);
        for(int i = 2; i <= squareRoot; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
