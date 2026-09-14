package lab1;

public class Main {
    static void main(String[] args) {
        FizzBuzz.doFizzBuzz(5);
        // doFizzBuzz in FizzBuzz.java is public.
        // Such that we could call it here.

        // FizzBuzz.main();
        // The line above does not work.
        // public static void main(String[] args) requires one argument
        // specifically a String[]
        FizzBuzz.main(args);
        // or FizzBuzz.main(new String[0]);



    }
}
