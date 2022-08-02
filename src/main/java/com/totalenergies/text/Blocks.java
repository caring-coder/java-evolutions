package com.totalenergies.text;

public class Blocks {
    private static final String template = """
                {
                    "key": "%s",
                    "key2": "value2"
            }""";

    public static void main(String[] args) {
        String.format("Voici un template nommé %s !", "valeur");

        System.out.println(template.formatted("valeur"));
    }
}
