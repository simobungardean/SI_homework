package homework_intro;

public class Main {

    public static void main(String[] args) {
        System.out.print("Sum of the first 100 numbers higher than 0: ");
        System.out.println(sum(21));

        int[] numbers = {8, 6, 4, 1, 9};
        System.out.print("The smallest number from array: ");
        System.out.println(minimum(numbers, 5));

        System.out.print("The max digit from a number: ");
        System.out.println(maxDigit(15932));

        System.out.println("Check if a number is palindrom");
        int n = 1234321;
        if (palindrom(n)) System.out.println(n + " is palindrom");
        else System.out.println(n + " is not palindrom");

        n = 1234567;
        if (palindrom(n)) System.out.println(n + " is palindrom");
        else System.out.println(n + " is not palindrom");

        System.out.println("All the prime numbers lower than a given number:");
        primes(30);
    }

    //	the sum of the first 100 numbers higher than 0
    public static int sum(int n) {
        int value = 1;
        for (int i = 2; i <= n; i++) value += i;

        return value;
    }

    //	the smallest number from an array of number
    public static int minimum(int[] numbers, int length) {
        int min = numbers[0];
        for(int i = 1; i < length; i++)
            if (numbers[i] < min) min = numbers[i];

        return min;
    }

    //	the max digit from a number
    public static int maxDigit(int n) {
        int digit = 0;
        while(n > 0) {
            int c = n % 10;
            if (c > digit) digit = c;
            n /= 10;
        }

        return digit;
    }

    //	check if a number is palindrom
    public static boolean palindrom(int n) {
        int ninv = 0;
        int m = n;
        while (m > 0) {
            ninv = ninv * 10 + m % 10;
            m /= 10;
        }

        return n == ninv;
    }

    //	check a number is prime
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++)
            if (n % i == 0) return false;

        return true;
    }

    //	all the prime numbers lower than a given number
    public static void primes(int n) {
        for (int i = 2; i < n; i++)
            if(isPrime(i)) System.out.print(i + " ");
    }
}
