package com.khushuu.ComplexDatas;

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
        // String str = sb.toString();
        // System.out.println(str);
        System.out.println(sb);

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
