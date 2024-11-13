/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest6;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float total = 0;
        float quant = 0;
        boolean entrada = true;
        do{
            System.out.println("Digite um valor (digite letra para sair): ");
            String res = s.next();
            try{
                float val = Float.parseFloat(res);
                total += val;
                quant++;
            }catch(Exception e){
                entrada = false;
            }
        }while(entrada);
        System.out.println("Total do valor: "+total);
        System.out.println("Quantidade de numeros: "+quant);
        System.out.println("Media dos valores: "+(total/quant));
    }
}
