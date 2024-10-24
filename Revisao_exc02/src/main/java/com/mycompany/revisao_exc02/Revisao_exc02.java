/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc02;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc02 {

    public static void main(String[] args) {

        // 2. Número Par ou Ímpar
        Scanner ler = new Scanner(System.in);
        int n1 = 0;

        System.out.println("Digite o numero de itens no estoque: ");
        n1 = ler.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O numero de itens no estoque eh par");

        } else {
            System.out.println("O numero de itens no estoque eh impar");
        }

    }
}
