import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- SNAKE LADDER --");
        
        Player player = new Player();
        while(player.position < 100){
            int current = player.position;

            System.out.println("Current Position: " + player.position);
            
            player.play();
            if(player.position == 100){
                System.out.println("WIN!");
                System.out.println("TOTAL DICE ROLLS: " + player.totalcount);
            }
            if(player.position > 100 || player.position < 0){
                player.position = current;
            }

            System.out.println("Moved To: " + player.position);
        }
        
    }
}

class Player{
    int position = 0;
    int totalcount = 0;

    int rollDice(){
        Random random = new Random();
        return random.nextInt(1, 6+1);
    }

    void play(){
        // OPTIONS:
        // 1. No Play
        // 2. Ladder
        // 3. Snake
        
        Random random = new Random();
        int option = random.nextInt(1,3+1);
        int move = rollDice();
        totalcount += 1;

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
