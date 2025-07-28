import java.util.Random;
import java.util.Scanner;

public class project_1  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        // taking multiple rounds with the help of static_method(Scanner scanner) and for_loop 

       System.out.println("How many rounds would  you  like to play: ");
            int round =Integer.parseInt(sc.nextLine());
            for(int i = 0; i<round; i++){
                playgame(sc); 

            }
        }
            static void playgame(Scanner sc){
                 
                // taking input from user.

                System.out.println("Make a move! (rock/paper/scissors)");
                String playerMove = sc.nextLine();

                // taking computer input.

                Random random = new Random();
                int randomNumber = random.nextInt(3);
                String computerMove;
                if(randomNumber == 0){
                    computerMove = "rock";
                }
                else if(randomNumber == 1){
                    computerMove = "paper";
                }
                else{
                    computerMove = "scissors";
                }
                    System.out.println("computer choose " + computerMove);
                    
                    if(playerMove.equals(computerMove)){
                        System.out.println("it is tie : ");
                    }
                    else if(playerwins(playerMove, computerMove)){
                        System.out.println("Player wins!");
                    }
                    else{
                        System.out.println("Computerwins!");
                    }
            }
            
    //who wins?...use static boolean method( retrun true if playerwins otherwise return false if computerwins) to find out who wins and use if_else.
    
    static boolean playerwins(String playerMove , String computerMove ){
        if(playerMove.equals("rock")){
            return computerMove.equals("scissors");
        }
        else if(playerMove.equals("paper")){
            return computerMove.equals("rock");
        }
        else{
           return computerMove.equals("paper");
        }
        
    }
}

     
    
            

        











    

    

            

    


    
    


        
        
    




            
            

          

    
    
    


   