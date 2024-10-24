/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc06;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc06 {

    public static void main(String[] args) {
        
        //6. Média de Três Números

        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, media;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite em sequencia as tres notas do aluno: ");
            n1 = ler.nextFloat();
            n2 = ler.nextFloat();
            n3 = ler.nextFloat();
            media = (n1 + n2 + n3) / 3;
            System.out.println("A media do aluno foi: "+ media);
        }
       
        
  
        
    }
}
