package com.khushuu.ComplexDatas;


import java.math.BigInteger;

/* Storing large integers:


 */
class BigNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(66534);
        BigInteger C = BigInteger.valueOf(a);
        BigInteger D = new BigInteger("67676");

        int c = B.intValue();
        BigInteger E = BigInteger.TEN;
        BigInteger S = A.add(B);
        System.out.println(S);
    }
}
