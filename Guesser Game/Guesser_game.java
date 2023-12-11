import java.util.*;
class guesser{
    int guesNum;
    int guessingNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("         GAME STARTED ");
        System.out.println("Guesser! kindly guess the number");
        guesNum=sc.nextInt();
        System.out.println("Umpire!");

        return guesNum;
    }
}
class Player{
    int gues_num;
    int player(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        gues_num=sc.nextInt();
        return gues_num;
    }

}
class Umpire{
    int guessedNum,gues_num1,gues_num2,gues_num3;
    void umpire(){
        guesser gues=new guesser();
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        guessedNum=gues.guessingNum();

        int n1=guessedNum-5;
        int n2=guessedNum+5;
        System.out.println("Guess the number between "+n1+" to "+n2);
        gues_num1=p1.player();
        gues_num2=p2.player();
        gues_num3=p3.player();
    }
    void compare() {
        if (guessedNum == gues_num1) {
            if (guessedNum==gues_num2&&guessedNum==gues_num3) {
                System.out.println("All Player win!");
            }
             else if (guessedNum==gues_num2) {
                System.out.println("Player1 & Player2 both wins!");
            }
            else if (guessedNum==gues_num3) {
                System.out.println("Player1 & Player3 both wins!");
            }
            else {
                System.out.println("Player1 wins!");
            }
        } else if (guessedNum == gues_num2) {
            if (guessedNum==gues_num1) {
                System.out.println("Player1 & Player2 both wins!");
            } else if (guessedNum==gues_num3) {
                System.out.println("Player2 & Player3 both wins!");
            }
            else {
                System.out.println("Payer2 wins!");
            }

        } else if (guessedNum == gues_num3) {
            if (guessedNum==gues_num2) {
                System.out.println("Player2 & Player3 both wins!");
            }else if (guessedNum==gues_num1) {
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
