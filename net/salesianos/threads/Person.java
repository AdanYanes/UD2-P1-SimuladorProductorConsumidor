package net.salesianos.threads;

public class Person extends Thread{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getPersonName(){
        return this.name;
    }
}
