package net.salesianos.threads;

import net.salesianos.utils.Restaurant;

public class Farmer extends Person{

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
                Thread.sleep((long)(Math.floor(Math.random() *(15 - 5 + 1) + 5) * 1000));
                String veggie = veggies[(int)(Math.floor(Math.random() *(veggies.length - 0 + 1)+ 0))];
                this.restaurant.addVeggie(veggie);
                System.out.println(this.getPersonName() + " ha plantado: " + veggie);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
