package net.salesianos.threads;

public class Farmer extends Person{

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
                Thread.sleep((long)(Math.floor(Math.random() *(15 - 5 + 1) + 5) * 1000));
                System.out.println("Ha plantado: " + veggies[(int)(Math.floor(Math.random() *(veggies.length - 0 + 1)+ 0) * 1000)]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
