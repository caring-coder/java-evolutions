package com.totalenergies.pattern;

public final class Rectangle extends Shape {
    private final int l;
    private final int w;

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int length() {
        return l;
    }

    public int width() {
        return w;
    }
}
