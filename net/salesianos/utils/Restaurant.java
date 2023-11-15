package net.salesianos.utils;

import java.util.LinkedList;

public class Restaurant {

    private int storageLimit;

    private LinkedList<String> storage = new LinkedList<String>();

    public Restaurant(int storageLimit){
        this.storageLimit = storageLimit;
    }

    public void addVeggie(String veggie){
        if(storage.size() < storageLimit){
            storage.add(veggie);
        }
    }

    public String removeVeggie(){
        if(storage.size() > 0){
            return storage.removeFirst();
        }
        return null;
    }
    
}
