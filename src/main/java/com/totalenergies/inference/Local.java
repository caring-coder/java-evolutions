package com.totalenergies.inference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.function.Consumer;

public class Local {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.oracle.com/");
        URLConnection conn = url.openConnection();
        Reader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        System.out.println(reader.read());
    }

    public static void main2(String[] args) throws IOException {
        var url = new URL("http://www.oracle.com/");
        var conn = url.openConnection();
        var reader = new BufferedReader( new InputStreamReader(conn.getInputStream()));
        System.out.println(reader.read());

        List<String> names = List.of("Sarah", "Palin", "Donald");
        for(var name : names){

        }

        Consumer<String> lambda = (var str)->{System.out.println(str);};
    }
    // var list = new ArrayList<String>();
    // for (var element : myList) {...}
    // try (var input = new FileInputStream("validation.txt")) {...}
    // (var a, var b) -> a + b;
}
