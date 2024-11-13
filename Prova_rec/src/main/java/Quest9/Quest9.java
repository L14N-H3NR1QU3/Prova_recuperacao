/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest9;

/**
 *
 * @author l.silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Quest9 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        String categoria[] = {"Pena", "Leve", "Ligeiro", "Meio medio", "Medio", "Meio pesado", "pesado"};
        System.out.println("Nome: ");
        String nome = s.next();
        System.out.println("Peso: ");
        float peso = s.nextFloat();
        FileWriter arquivo = new FileWriter("Lutador"+nome+".txt");
        PrintWriter g = new PrintWriter(arquivo);
        if(peso < 65){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[0]);
        }
        else if(peso >= 65 && peso < 72){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[1]);
        }
        else if(peso >= 72 && peso < 79){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[2]);
        }
        else if(peso >= 79 && peso < 86){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[3]);
        }
        else if(peso >= 86 && peso < 93){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[4]);
        }
        else if(peso >= 93 && peso < 100){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[5]);
        }
        else if(peso >= 100){
            g.println("Lutador "+nome+" pesa "+peso+" Kg e se enquadra na categoria "+categoria[6]);
        }
        arquivo.close();
    }
}
