package net.salesianos.utils;

import java.util.LinkedList;

public class Restaurant {

    private int storageLimit;

    private LinkedList<String> storage = new LinkedList<String>();

    public Restaurant(int storageLimit){
        this.storageLimit = storageLimit;
    }

    public synchronized void addVeggie(String veggie){
        while(storage.size() >= storageLimit){
           try{
                wait();
           } catch (InterruptedException e){
                e.printStackTrace();
           }
        }

        storage.add(veggie);
        notifyAll();
    }

    public synchronized String getVeggie(){
        while (storage.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        notifyAll(); 
        return storage.removeFirst();
    }
    
}
