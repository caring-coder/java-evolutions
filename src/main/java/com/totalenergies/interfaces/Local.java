package com.totalenergies.interfaces;

interface LocalFunction{
    void doSomething(String value);
}

public class Local {
    public static void main(String[] args) {
        interface LocalFunction{
            void doSomething(String value);
        }

        LocalFunction printToOutput = x -> System.out.println(x);

        StringBuilder strBuilder = new StringBuilder();
        LocalFunction appendToBuilder = strBuilder::append;
    }
}
