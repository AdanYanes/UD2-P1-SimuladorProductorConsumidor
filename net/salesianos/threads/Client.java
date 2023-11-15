package net.salesianos.threads;

import net.salesianos.utils.Restaurant;
import java.util.Random;

public class Client extends Person{

    private int veggieCounter;

    Random random = new Random();

    private Restaurant restaurant;

    public Client(String name, int veggieCounter, Restaurant restaurant) {
        super(name);
        this.veggieCounter = veggieCounter;
        this.restaurant = restaurant;
    }

    @Override
    public void run(){
        for (int i = 0; i < veggieCounter; i++) {
            try {
                Thread.sleep((long)(random.nextInt((15 - 10 + 1) + 10) * 1000));
                String veggie = restaurant.getVeggie();
                System.out.println(this.getPersonName() + " ha consumido: " + veggie);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
