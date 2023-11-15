package net.salesianos.threads;

public class Client extends Person{

    private int veggieCounter;

    public Client(String name, int veggieCounter) {
        super(name);
        this.veggieCounter = veggieCounter;
    }

    @Override
    public void run(){
        for (int i = 0; i < veggieCounter; i++) {
            try {
                Thread.sleep((long)(Math.floor(Math.random() *(15 - 5 + 1) + 5) * 1000));
                System.out.println("Ha consumido: ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
