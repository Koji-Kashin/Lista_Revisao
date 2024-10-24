/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc03;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc03 {

    public static void main(String[] args) {
        // 3. Maior entre Dois Números
        Scanner ler = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite a nota do primeiro jogador: ");
        n1 = ler.nextInt();
        System.out.println("Agora digite a nota do segundo jogador: ");
        n2 = ler.nextInt();

        if (n1 > n2) {
            System.out.println("Parabens jogador 1, voce venceu a partida");

        } else {
            System.out.println("Parabens jogador 2, voce venceu a partida");
        }

    }
}
