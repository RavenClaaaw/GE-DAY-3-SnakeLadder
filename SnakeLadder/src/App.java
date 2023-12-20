import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- SNAKE LADDER --");
        
        Player player1 = new Player();
        Player player2 = new Player();

        while(player1.position < 100 && player2.position < 100){
            int current1 = player1.position;
            int current2 = player2.position;

            System.out.println("Current Position: " + player1.position + " & " + player2.position);
            
            player1.play();
            player2.play();
            if(player1.position == 100 || player2.position == 100){
                if(player1.position == 100) System.out.println("PLAYER - 1: WIN!");
                else System.out.println("PLAYER - 2: WIN!");
                // System.out.println("TOTAL DICE ROLLS: " + player.totalcount);
            }

            // Condition Check
            if(player1.position > 100 || player1.position < 0){
                player1.position = current1;
            }
            if(player2.position > 100 || player2.position < 0){
                player2.position = current2;
            }

            System.out.println("Moved To: " + player1.position + " & " + player1.position);
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
