package com.totalenergies.pattern;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj1 = Integer.valueOf(6);
        Object obj2 = "Whatever";

        if(obj1 instanceof String str)
            System.out.println(str.charAt(2));
        else if (obj1 instanceof Integer i) {
            System.out.println(i.doubleValue() * 5.0);
        }

    }
}
