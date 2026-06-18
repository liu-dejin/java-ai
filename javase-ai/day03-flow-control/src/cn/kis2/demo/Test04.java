package cn.kis2.demo;

public class Test04 {
    static void main() {
        getPrimeNumber();
    }

    static void getPrimeNumber() {
        for (int i = 101; i < 200; i++) {
            if (judgePrimeNumbers(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean judgePrimeNumbers(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
