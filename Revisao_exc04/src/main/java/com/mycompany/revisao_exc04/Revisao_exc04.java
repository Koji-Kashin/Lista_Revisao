/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc04;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc04 {

    public static void main(String[] args) {
        //4. Tabuada de um número
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero e exibiremos a sua tabuada");
        num = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);

        }
    }
}
