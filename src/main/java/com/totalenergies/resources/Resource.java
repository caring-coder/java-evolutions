package com.totalenergies.resources;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed " + name);
    }
}
