/* Input: 
Hello world
5

Output:
Hello world
Mjpptd.twpi

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        String f1; // Frase Normal.
        String f2; // Frase Cifrada.
        int a; // Desplazamiento.
        
        String min = "abcdefghijklmnñopqrstuvwxyz .";
        String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ .";
        f2 = "";
        
        System.out.print("Introduce una frase: ");
        f1 = teclado.nextLine();
        
        System.out.print("Introduce la clave de desplazamiento: ");
        a = teclado.nextInt();
        
        for (int i = 0; i < f1.length(); i++){
            for (int j = 0; j < min.length(); j++){
                if(f1.charAt(i) == min.charAt(j)){
                    if(j + a >= min.length()){
                        f2 += min.charAt((j + a) % min.length());
                    } else {
                        f2 += min.charAt(j + a);
                    }
                } else if (f1.charAt(i) == may.charAt(j)){
                    if(j + a >= may.length()){
                        f2 += may.charAt((j + a) % may.length());
                    } else {
                        f2 += may.charAt(j + a);
                    }
                }
            }
        }
        System.out.println("Tu frase es: "+f1);
        System.out.println("Tu frase cifrada es: "+f2);
    }
}
