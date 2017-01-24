package org.tnl.demo.java;

/**
 * Created by tim on 23-12-16.
 */
public class Main {

    static public void main(String... args) {
        Person person = null;


    }

    static public void printPersonAddress(Person person) {
        if (person != null && person.getAddress() != null && person.getAddress().getStreet() != null) {
            System.out.println("Street: " + person.getAddress().getStreet());
        } else {
            System.out.println("Street: not given");
        }
        if (person != null && person.getAddress() != null && person.getAddress().getCity() != null) {
            System.out.println("City: " + person.getAddress().getCity());
        } else {
            System.out.println("City: not given");
        }
    }
}
