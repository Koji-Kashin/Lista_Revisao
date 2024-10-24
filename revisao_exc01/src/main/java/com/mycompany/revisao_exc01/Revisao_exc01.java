/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc01;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc01 {

    public static void main(String[] args) {

        // 1. Soma de Dois Números
        Scanner ler = new Scanner(System.in);
        float n1, n2, resultado;

        System.out.println("Digite dois numeros para obter a soma!");
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextFloat();
        System.out.println("Agora digite o segundo numero: ");
        n2 = ler.nextFloat();
        resultado = n1 + n2;
        System.out.print("O resultado da soma de " + n1 + " + " + n2 + " eh = ");
        System.out.print(resultado);

    }
}
