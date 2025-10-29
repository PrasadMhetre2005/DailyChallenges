package DailyTasks.Level1;


import java.util.Random;
import java.util.Scanner;

public class Minigame_byConditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] movechoose = {"rock", "paper", "scissor"};
            String computermove = movechoose[new Random().nextInt(movechoose.length)];

            String playermove;
            while (true) {
                System.out.println("enter your move plz \n rock\n paper\n scissor");
                playermove = sc.nextLine();
                if (playermove.equals("rock") || playermove.equals("paper") || playermove.equals("scissor")) {
                    break;
                }
                System.out.println(playermove + "is not a valied move\n enter vailed move plz");

            }
            System.out.println("computer played " + computermove);
            System.out.println("play again ?\n yes\n no\n");
            if (playermove.equals(computermove)) {
                System.out.println("tie the match");
            }
            else if (playermove.equals("rock")) {
                if (computermove.equals("paper")) {
                    System.out.println("you are lose the match");
                }
                else if (computermove.equals("scissor")) {
                    System.out.println("you will win the match");

                }
            }
            else if (playermove.equals("paper")) {
                if (computermove.equals("rock")) {
                    System.out.println("you are win the match");
                }
                else if (computermove.equals("scissor")) {
                    System.out.println("you will lose the match");

                }
            }
            else if (playermove.equals("scissor")) {
                if (computermove.equals("paper")) {
                    System.out.println("you are win the match");
                }
                else if (computermove.equals("rock")) {
                    System.out.println("you will lose the match");

                }
            }
            String playagain=sc.nextLine();
            if(!playagain.equals("yes")){
                break;

            }



        }
    }
}

