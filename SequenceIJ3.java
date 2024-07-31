/* Print the sequence like the example below.
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
*/
public class Main {
    public static void main(String [] args){
        int a = 7; int b = 5;
        for (int i = 1; i < 10; i += 2){
            for (int j = a; j >= b; j--){
                System.out.println("I="+i+" J="+j);
            }
            a += 2; b += 2;
        }
    }
}
