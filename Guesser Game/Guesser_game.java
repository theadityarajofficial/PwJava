import java.util.*;
class guesser{
    int guesNum;
    int guessingNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("         GAME STARTED");
        System.out.println("Please guess the number btween 0-9!");
        System.out.println("Guesser! kindly guess the number");
        guesNum=sc.nextInt();
        return guesNum;
    }
}
class Player{
    int gues_num1,gues_num2,gues_num3;
    int player1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Umpire!");
        System.out.println("Player1! Kindly guess the number");
        gues_num1=sc.nextInt();
        return gues_num1;
    }
    int player2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player2! Kindly guess the number");
        gues_num2=sc.nextInt();
        return gues_num2;
    }
    int player3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player3! Kindly guess the number");
        gues_num3=sc.nextInt();
        return gues_num3;
    }
}
class Umpire{
    int guessedNum,gues_num1,gues_num2,gues_num3;
    void umpire(){
        guesser gues=new guesser();
        Player player=new Player();
        guessedNum=gues.guessingNum();
        gues_num1=player.player1();
        gues_num2=player.player2();
        gues_num3=player.player3();
    }
    void compare() {
        if (guessedNum == gues_num1) {
            if (guessedNum==gues_num1&&guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("All Player win!");
            }
            else if (guessedNum==gues_num1&&guessedNum==gues_num2) {
                System.out.println("Player1 & Player2 both wins!");
            } else if (guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("Player2 & Player3 both wins!");
            }else if (guessedNum==gues_num1&&guessedNum==gues_num3) {
                System.out.println("Player1 & Player3 both wins!");
            }
            else {
                System.out.println("Player1 wins!");
            }
        } else if (guessedNum == gues_num2) {

            if (guessedNum==gues_num1&&guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("All Player win!");
            }
            else if (guessedNum==gues_num1&&guessedNum==gues_num2) {
                System.out.println("Player1 & Player2 both wins!");
            } else if (guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("Player2 & Player3 both wins!");
            }else if (guessedNum==gues_num1&&guessedNum==gues_num3) {
                System.out.println("Player1 & Player3 both wins!");
            }
            else {
                System.out.println("Payer2 wins!");
            }

        } else if (guessedNum == gues_num3) {
            if (guessedNum==gues_num1&&guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("All Player win!");
            }
            else if (guessedNum==gues_num1&&guessedNum==gues_num2) {
                System.out.println("Player1 & Player2 both wins!");
            } else if (guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("Player2 & Player3 both wins!");
            }else if (guessedNum==gues_num1&&guessedNum==gues_num3) {
                System.out.println("Player1 & Player3 both wins!");
            }
            else {
                System.out.println("Player3 wins!");
            }

        } else {
            System.out.println("Game Lost!");
        }
    }
    void combine(){
        Umpire u=new Umpire();
        u.umpire();
        u.compare();
    }
}
public class Guesser_game {
    public static void main(String[] args) {
        Umpire ump=new Umpire();
        ump.combine();
    }
}
