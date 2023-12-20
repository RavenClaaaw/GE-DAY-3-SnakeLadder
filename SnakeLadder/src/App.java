import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- SNAKE LADDER --");
        
        Player player = new Player();
        while(player.position <= 100){
            System.out.println(player.position);
            player.play();
        }
        
    }
}

class Player{
    int position = 0;

    int rollDice(){
        Random random = new Random();
        return random.nextInt(1,6);
    }

    void play(){
        // OPTIONS:
        // 1. No Play
        // 2. Ladder
        // 3. Snake
        
        Random random = new Random();
        int option = random.nextInt(1,3);
        int move = rollDice();

        switch (option) {
            case 1:
                position += 0;
                break;
            
            case 2:
                position += move;
                break;
            
            case 3:
                position -= move;
                break;
        }
    }
}
