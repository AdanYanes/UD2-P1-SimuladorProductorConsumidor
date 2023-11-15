package net.salesianos.threads;

import net.salesianos.utils.Restaurant;
import java.util.Random;

public class Farmer extends Person{

    Random random = new Random();

    private String[] veggies = {"lettuce", "cabbage", "onion", "spinach", "potato",
                                "celery", "asparagus", "radish", "broccoli", "artichoke",
                                "tomato", "cucumber", "eggplant", "carrot",  "green bean"};

    private int plantCounter;

    private Restaurant restaurant;

    public Farmer(String name, int plantCounter, Restaurant restaurant) {
        super(name);
        this.plantCounter = plantCounter;
        this. restaurant = restaurant;
    }

    @Override
    public void run(){
        for (int i = 0; i < plantCounter; i++) {
            try {
                Thread.sleep((long)(random.nextInt((5 - 0 + 1) + 0)) * 1000);
                String veggie = veggies[random.nextInt((veggies.length - 0))];
                this.restaurant.addVeggie(veggie);
                System.out.println(this.getPersonName() + " ha plantado: " + veggie);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
