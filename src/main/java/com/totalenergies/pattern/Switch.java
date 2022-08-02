package com.totalenergies.pattern;

import java.util.function.Function;

public class Switch {
    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c    -> 2 * c.radius() * Math.PI;
            default          -> throw new IllegalArgumentException("Unrecognized shape");
        };
    }

    static void test(Object obj) {
        switch (obj) {
            case String s:
                if (s.length() == 1) {
                    System.out.println("Short: " + s);
                } else {
                    System.out.println(s);
                }
                break;
            default:
                System.out.println("Not a string");
        }
    }

    static void test2(Object obj) {
        switch (obj) {
            case String s && (s.length() == 1) -> System.out.println("Short: " + s);
            case String s                      -> System.out.println(s);
            default                            -> System.out.println("Not a string");
        }
    }

    static Function<Integer, String> testParen(Object obj) {
        boolean b = true;
        return switch (obj) {
            case String s && b -> t -> s;
            default            -> t -> "Default string";
        };
    }

    static Function<Integer, String> testParen2(Object obj) {
        boolean b = true;
        return switch (obj) {
            case (String s && b) -> t -> s;
            default              -> t -> "Default string";
        };
    }
}
