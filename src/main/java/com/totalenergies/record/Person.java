package com.totalenergies.record;

public record Person(String firstName, String lastName) {
    public static Person newPerson(String name){
        return new Person(name, "Anonyme");
    }

    // Explicit Canonical Constructor
    /*
    public Person(String firstName, String lastName){
        if(firstName == null)
            throw new IllegalArgumentException();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    */

    // Explicit member functions
    /*
    public String lastName(){
        System.out.println("Called last name, and got value " + lastName);
        return lastName;
    }
    */
}

/**
 * public final class Person {
 *     private final String firstName;
 *     private final String lastName;
 *
 *     public Person(String firstName, String lastName) {
 *         this.firstName = firstName;
 *         this.lastName = lastName;
 *     }
 *
 *     String firstName() { return this.firstName; }
 *     String lastName()  { return this.lastName; }
 *
 *     // Implementation of equals() and hashCode(), which specify
 *     // that two record objects are equal if they
 *     // are of the same type and contain equal field values.
 *     public boolean equals...
 *     public int hashCode...
 *
 *     // An implementation of toString() that returns a string
 *     // representation of all the record class's fields,
 *     // including their names.
 *     public String toString() {...}
 * }
 */

