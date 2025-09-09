package lab1;

public class Multiples {
    public static void main(String[] args) {
        //System.out.println(multiples());

    }

         public static int multiples(int n, int a, int b) {
            int j = 0;
            for (int i = 1; i < n; i++) {
                boolean divisibleBya = i % a == 0;
                boolean divisibleByb = i % b == 0;

                if (divisibleBya) {
                    j++;
                }
                else if (divisibleByb) {
                    j++;
                }
            }
            return j;
    }
}
