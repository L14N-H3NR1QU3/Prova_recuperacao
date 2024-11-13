/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest7;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nome P1: ");
        String P1 = s.next();
        System.out.println("Filme: ");
        String filme = s.next();
        String dicas[] = new String[5];
        boolean venceu = false;
        for(int i = 0; i < 5; i++){
            System.out.println("Dica "+(i+1)+": ");
            dicas[i] = s.next();
        }
        System.out.println("Nome P2: ");
        String P2 = s.next();
        System.out.println("Filme: ");
        String res = s.next();
        if(!res.equals(filme)){
            for(int i = 0; i < 5; i++){
                System.out.println("Dica "+(i+1)+": "+dicas[i]);
                System.out.println("Filme: ");
                res = s.next();
                if(res.equals(filme)){
                    venceu = true;
                    break;
                }
            }
        }
        if(venceu){
            System.out.println(P2+" venceu!");
        }
        else if(!venceu){
            System.out.println(P1+" venceu!");
        }
    }
}
