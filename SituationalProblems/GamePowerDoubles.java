package SituationalProblems;
/*
Contest called "Power Doubles" is being played. Each player starts with a number - Rahul starts with
number A and Reema starts with number B. The game has N rounds and in each round the player takes turns
doubling their own number. Rahul always begins first, and they continue alternating turns. So if there
are 5 rounds, Rahul plays rounds 1, 3 ,5 while Reema plays rounds 2, 3.
At the end of all rounds:
    Rahul's number becomes C
    Reema's number becomes D
The final team score is teh sum of their numbers after the game ends , i.e., C+D.
Write a program to help the event organisers compute the final score of the team after N rounds based on
the initial numbers A and B.
Sample input 1 : 3 2 5
where , 3 : Initial point of Rahul
        2 : Initial point of Reema
        5 : No of rounds
Sample output : 32
Sample input 2 : 1 2 1
Sample output 2: 4
 */
import java.util.*;
public class GamePowerDoubles {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int RahulScore = sc.nextInt();
        int ReemaScore = sc.nextInt();
        int rounds = sc.nextInt();
        for(int round = 1;round<=rounds;round++)
        {
            if(round%2==1)
                RahulScore=RahulScore*2;
            else
                ReemaScore=ReemaScore*2;
        }
        int result = RahulScore + ReemaScore;
        System.out.println(result);
    }
}
