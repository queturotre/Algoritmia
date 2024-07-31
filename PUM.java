/*Write a program that reads an integer N. This N is the number of output lines printed by this program.

Input
The input file contains an integer N.

Input Sample	
7

Output Sample
1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
13 14 15 PUM
17 18 19 PUM
21 22 23 PUM
25 26 27 PUM
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner z = new Scanner(System.in);
        int a;
        int b = 1;
        int c = 4; 
        
        a = z.nextInt();
        for(int i = 0; i < a; i++){
            for(int j = b; j <= c; j++){
                if(j % 4 == 0){
                    System.out.print("PUM");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            b += 4; c += 4;
        }
    }
}
