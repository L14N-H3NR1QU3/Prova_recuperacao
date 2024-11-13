/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest5;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int res = 0;
        int usuarioCorreto = 1234;
        int senhaCorreta = 9999;
        do{
            System.out.println("Digite o usuario: ");
            res = s.nextInt();
            if(res != usuarioCorreto){
                System.out.println("\nUsuario invalido!\n");
            }
        }while(res != usuarioCorreto);
        System.out.println("\n");
        do{
            System.out.println("Digite o senha: ");
            res = s.nextInt();
            if(res != senhaCorreta){
                System.out.println("\nsenha invalido!\n");
            }
        }while(res != senhaCorreta);
        System.out.println("\nAcesso permitido");
    }
}
