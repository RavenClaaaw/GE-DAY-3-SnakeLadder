import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- SNAKE LADDER --");

    }
}

class Player{
    int position = 0;

    int rollDice(){
        Random random = new Random();
        return random.nextInt(1,6);
    }
}
