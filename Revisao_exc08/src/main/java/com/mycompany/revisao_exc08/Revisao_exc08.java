/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc08;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc08 {

    public static void main(String[] args) {
        
        //8. Média de Notas de Alunos



        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, media;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite em sequencia as notas do aluno: ");
            n1 = ler.nextFloat();
            n2 = ler.nextFloat();
            n3 = ler.nextFloat();
            media = (n1 + n2 + n3) / 3;

            if (media >= 6) {
                System.out.println("O aluno esta aprovado!");

            } else {
                System.out.println("O aluno esta reprovado");
            }

        }

    }
}
