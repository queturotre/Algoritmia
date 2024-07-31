/*Print the sequence like the example below.
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
*/
public class Main {
    public static void main (String[] args){
        double a = 1.0; double b = 3.0;
        for (double i = 0.0; i <= 2.0; i += 0.2){
            double r3 = Math.round (a * 10)/10.0;
            double r4 = Math.round (b * 10)/10.0;
            for (double j = r3; j <= r4; j ++){
                if(i == 0.0 || i == 1.0){
                    int e = (int) i;
                    int f = (int) j;
                    System.out.println("I="+e+" J="+f);
                }else if(i == 1.9999999999999998){
                    int e = (int) i + 1;
                    int f = (int) j;
                    System.out.println("I="+e+" J="+f);
                }else{
                    double r1 = Math.round (i * 10)/10.0;
                    double r2 = Math.round (j * 10)/10.0;
                    System.out.println("I="+r1+" J="+r2);
                }
            }
            a += 0.2; b += 0.2;
        }
    }
}
