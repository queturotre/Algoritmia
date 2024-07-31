/* Print the sequence like the example below. 
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
*/

public class Main {
    public static void main (String[] args){
        int j = 60; // Va de 60 a 0 con paso -5.
        for (int i = 1; i <= 37; i = i + 3){
            System.out.println("I="+i+" J="+j);
            j = j - 5;
        }
    }
}
