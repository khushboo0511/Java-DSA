package com.khushboo.hashes;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Khushuu", 40);
        map.put("Jyoti", 46);
        map.put("Shalaka", 48);
        map.put("Swapnaja", 47);
        map.put("Sumanth", 42);
        map.put("Varun", 43);
        map.put("Kalpesh", 44);

        System.out.println(map.get("Khushuu"));

        HashMapFinal<String, String> map2 = new HashMapFinal<>();

        map2.put("Mango", "King of fruits");
        map2.put("Apple", "A sweet red fruit");
        map2.put("Litchi", "Kunal's fav fruit");

        System.out.println(map2);

    }
}