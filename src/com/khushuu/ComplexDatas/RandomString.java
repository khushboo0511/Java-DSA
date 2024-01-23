package com.khushuu.ComplexDatas;

import java.util.Random;

class RandomString {
//    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextFloat());
//    }
    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for (int i=0; i<size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }
        return sb.toString();

    }

}
