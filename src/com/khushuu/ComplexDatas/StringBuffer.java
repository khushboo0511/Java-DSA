package com.khushuu.ComplexDatas;

import java.text.DecimalFormat;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        //Constructor 1
        StringBuffer sb = new StringBuffer();

        // Constructor 2
        StringBuffer sb2 = new StringBuffer("Khushboo Chaudhary");

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("We make Devs ");
        sb.append("is nice!");

        sb.insert(2, " Khushboo");
        sb.replace(2, 3, " Pooja ");

        sb.delete(1, 3);

        sb.reverse();

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        // String str = sb.toString();
        // System.out.println(str);
        System.out.println(sb);

        String sentence = "HIi abba dabba   jabba    haha dabba Prem baatli   hehehe";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        String arr = "Khushboo,Jyoti,Sarah,Shalaka,Swapnaja";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.2));


    }
}

/*

String Buffer :
Mutable set of characters
Strings are mutable
String Builder is not thread safe

Advantages over String:
1. Mutable
2. Efficient
3. Thread safe

 */
