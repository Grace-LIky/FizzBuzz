package lab1;

class Reduce{
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    static int reduce(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }

            steps++;
        }

        return steps;
    }
}