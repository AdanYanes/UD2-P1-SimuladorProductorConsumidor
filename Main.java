import net.salesianos.threads.Client;
import net.salesianos.threads.Farmer;
import net.salesianos.utils.Restaurant;

public class Main{
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant(3);

        Farmer paco = new Farmer("Paco", 10, restaurant);
        Farmer ramon = new Farmer("Ramon", 10, restaurant);

        Client faustino = new Client("Faustino", 5, restaurant);
        Client mrGentleman = new Client("Mr. Gentleman", 10, restaurant);
        Client loquendo = new Client("Loquendo", 5, restaurant);

        paco.start();
        ramon.start();

        faustino.start();
        mrGentleman.start();
        loquendo.start();
    }
}