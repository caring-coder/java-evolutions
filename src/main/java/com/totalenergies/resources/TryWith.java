package com.totalenergies.resources;

import java.io.IOException;

public class TryWith {
    public static void main(String[] args) throws IOException {
        final Resource resource1 = new Resource("resource1");
        Resource resource2 = new Resource("resource2");

        try{
            //do something
        } finally {
            resource1.close();
            resource2.close();
        }
    }

    public static void main2(String[] args) throws IOException {
        try (Resource r1 = new Resource("resource1");
             Resource r2 = new Resource("resource2")) {
            System.out.println("Using resources " + r1 + " and " + r2);
        }
    }

    public static void main3(String[] args) throws IOException {
        final Resource resource1 = new Resource("resource1");
        Resource resource2 = new Resource("resource2");
        try (resource1;
             resource2) {
            //do something
        }
    }
}
