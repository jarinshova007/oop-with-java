package uml11;

public class Number {
    public int number;

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime() {
        return(isPrime(number));
    }

    public boolean isGoldBach() {
        if (number < 4 || number % 2 != 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            int a = i;
            int b = number - i;
            if (isPrime(a) && isPrime(b)) {
                return true;
            }
        }
        return false;
    }
}
