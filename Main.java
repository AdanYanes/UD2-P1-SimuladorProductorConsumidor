import net.salesianos.threads.Client;
import net.salesianos.threads.Farmer;
import net.salesianos.utils.Restaurant;

public class Main{
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant(3);

        Farmer paco = new Farmer("Paco", 5, restaurant);

        Client faustino = new Client("Faustino", 5, restaurant);

        paco.start();
 

        faustino.start();



        try {
            paco.join();

            faustino.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}