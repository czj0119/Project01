package com.idea;

import java.util.HashMap;

/**
 * @author Administrator
 * @date 2018/9/14 - 9:51
 */
public class DEBUGTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","24");
        map.put("school","清华大学");
        map.put("major","计算机");

        String school = map.get("school");
        System.out.println("school = " + school);

        map.remove("age");

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map);
        }

    }

}
