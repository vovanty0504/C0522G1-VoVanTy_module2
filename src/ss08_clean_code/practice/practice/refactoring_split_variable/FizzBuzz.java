package ss08_clean_code.practice.practice.refactoring_split_variable;

import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập a");
        int number = scanner.nextInt();
        System.out.println(fizzBuzz(number));
    }
}
