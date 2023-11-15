import net.salesianos.threads.Farmer;

public class Main{
    public static void main(String[] args){
        Farmer antonio = new Farmer("Antonio", 4);

        antonio.start();
    }
}