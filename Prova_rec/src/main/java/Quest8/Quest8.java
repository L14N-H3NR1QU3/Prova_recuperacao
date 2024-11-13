/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest8;

/**
 *
 * @author l.silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Quest8 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int val = s.nextInt();
        FileWriter arquivo = new FileWriter("C:\\Users\\l.silva\\Desktop\\TabuadaDo"+val+".txt");
        PrintWriter g = new PrintWriter(arquivo);
        g.println("Tabuada do "+val);
        for(int i = 0; i < 10; i ++){
            g.println(val+" x "+(i+1)+" = "+(val*(i+1)));
        }
        arquivo.close();
    }
}
