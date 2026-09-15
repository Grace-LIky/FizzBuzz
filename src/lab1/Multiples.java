package lab1;

public class Multiples {

    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int total = 0;

        while (i < n) {
            boolean multiple_of_a = i % a == 0;
            boolean multiple_of_b = i % b == 0;

            if (multiple_of_a || multiple_of_b) {
                total++;
            }

            i++;
        }
        return total;
    }
    static int multiples(){
        return multiples(1000, 3, 5);
    }
}