package com.totalenergies.pattern;

public final class Circle extends Shape {
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    public int radius() {
        return r;
    }
}
