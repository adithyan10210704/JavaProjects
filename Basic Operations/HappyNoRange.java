package BasicOperations;// split the number into individual digits and square them.
// Add those digits and get a number. Do the same process again.
// If we arrive at the answer 1, it is a happy number

public class HappyNoRange {
    public static void main(String[] args) {
        System.out.println("Happy numbers between 1 and 100:");

        for (int number = 1; number <= 100; number++) {
            int currentNumber = number;
            int sum = 0;

            // Determine if the current number is happy
            while (sum != 1 && sum != 4) {
                sum = 0;
                while (currentNumber > 0) {
                    int digit = currentNumber % 10;
                    sum += Math.pow(digit, 2);
                    currentNumber /= 10;
                }
                currentNumber = sum;
            }

            // If the sum is 1, it is a happy number
            if (sum == 1) {
                System.out.print(number + " ");
            }
        }
    }
}