public class Calculator {

    //add this comment so people see a difference
    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int returnSumOfArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int divide(int numberOne, int numberTwo) {
        if (numberOne == 0 || numberTwo == 0)
            throw new ArithmeticException("denominator == 0");
        return numberOne / numberTwo;
    }
}

