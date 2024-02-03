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
    }
}