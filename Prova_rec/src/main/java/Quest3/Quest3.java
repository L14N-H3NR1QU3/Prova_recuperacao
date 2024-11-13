/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest3;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Quest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String nomeMenu[] = {"cafe expresso", "cafe capuccino", "leite com cafe"};
        float valMenu[] = {0.75f, 1.00f, 1.75f};
        int ped[] = new int[3];
        int total = 0;
        int esc;
        do{
        System.out.println("----------Menu----------");
        for(int i = 0; i < 3; i++){
            System.out.println((i+1)+" - "+nomeMenu[i]+" - R$"+valMenu[i]);
        }
        System.out.println("4 - totalizar vendas");
        System.out.println("------------------------");
        System.out.print("Escolha: ");
        esc = s.nextInt();
        if(esc < 4 && esc > 0){
            ped[esc-1]++;
        }
        else{
            System.out.println("\nEscolha invalida!\n");
        }
            }while(esc != 4);
        System.out.println("----------Total---------");
        for(int i = 0; i < 3; i++){
            total += valMenu[i]*ped[i];
            System.out.println("Quantidade - "+ped[i]+" - "+nomeMenu[i]+" - R$"+(valMenu[i]*ped[i]));
        }
        System.out.println("Valor total: R$"+total);
    }
}
