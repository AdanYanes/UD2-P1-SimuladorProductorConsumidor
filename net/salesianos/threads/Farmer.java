package net.salesianos.threads;

import java.util.Random;

public class Farmer extends Person{

    Random random = new Random();

    private String[] veggies = {"lettuce", "cabbage", "onion", "spinach", "potato",
                                "celery", "asparagus", "radish", "broccoli", "artichoke",
                                "tomato", "cucumber", "eggplant", "carrot",  "green bean"};

    private int plantCounter;

    public Farmer(String name, int plantCounter) {
        super(name);
        this.plantCounter = plantCounter;
    }

    @Override
    public void run(){
        for (int i = 0; i < plantCounter; i++) {
            try {
                Thread.sleep((long)(Math.floor(Math.random() *(15 - 5 + 1) * 1000) + 5));
                System.out.println("Ha plantado: " + veggies[random.nextInt(veggies.length - 0) + 0]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
