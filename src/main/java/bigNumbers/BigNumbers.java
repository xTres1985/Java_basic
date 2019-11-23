package bigNumbers;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("555555555555555555555555555555555555");
        BigInteger bigInteger2 = new BigInteger("22222222222222222222222222222222222222222222222222222");

        // metody klasy big intiger
        BigInteger bigIntegerAdd = bigInteger1.add(bigInteger2);
        BigInteger bigIntegerSub = bigInteger1.subtract(bigInteger2);
        BigInteger bigIntegerMulti = bigInteger1.multiply(bigInteger2);
        BigInteger bigIntegerDiv = bigInteger1.divide(bigInteger2);
        System.out.println(bigIntegerAdd);
        System.out.println(bigIntegerSub);
        System.out.println(bigIntegerMulti);
        System.out.println(bigIntegerDiv);
    }
}
