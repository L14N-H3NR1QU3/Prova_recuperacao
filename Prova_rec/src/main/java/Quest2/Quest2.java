/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest2;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite quantos anos voce tem: ");
        int ano = s.nextInt();
        System.out.println("Digite quantos meses tem (depois do ultimo aniversario): ");
        int mes = s.nextInt();
        System.out.println("Digite quantod dias tem (depois do ultimo aniversario): ");
        int dia = s.nextInt();
        int res = ano*365;
        res += mes*30;
        res += dia;
        System.out.println("Seu tempo de vida em dias e "+res+" dias!");
    }
}
