package SituationalProblems;
/*
Scheme:
A person starts from the origin 0 0 and first turns and travels 10 units of distance. His second turn is
upward for 20 units. Third turn is to the left for 30 units. Fourth turn is downward for 40 units. Fifth
turn is right(again) for 50 units, and thus he travels every time increasing the travel distance by 10
units.
Test Cases:
  1  Input : 3
     Expected output : -20 20
  2  Input : 4
     Expected output : -20 -20
  3  Input : 5
     Expected output : 30 -20
  4  Input : 6
     Expected output : 90 -20
 */
import java.util.*;
public class SoberWalk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int turns = sc.nextInt();
        int x=0, y =0, distance = 10;
        char direction = 'R';
        for(int step = 1; step<=turns;step++,distance =distance +10){
            if(direction=='R') {   //Step 1 -> Scheme 1
                x = x + distance;
                direction = 'U';
            }
            else if (direction =='U'){  //Step 2 -> Scheme 2
                y=y+distance;
                direction = 'L';
            }
            else if (direction =='L'){
                x=x-distance;
                direction = 'D';
            }
            else if (direction =='D'){
                y=y-distance;
                direction = 'A';  //Fifth right
            }
            else{
                x=x+distance;
                direction='R';
            }
        }
        System.out.printf("(%d,% d)",x,y);
    }
}
