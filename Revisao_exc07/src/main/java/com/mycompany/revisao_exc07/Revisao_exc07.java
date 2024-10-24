/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc07;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc07 {

    //Busca de Elementos em Vetor
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int tam = 0, val;
        System.out.println("Digite o tamanho do inventario: ");
        String resp = ler.next();
        try {
            tam = Integer.parseInt(resp);

        } catch (NumberFormatException e) {
            System.out.println("Numero invalido...");
        }
        int inv[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite os valores do inventario: ");
            resp = ler.next();
            try {
                inv[i] = Integer.parseInt(resp);
            } catch (NumberFormatException e) {
                i--;

            }

        }
        System.out.println("Digite o valor que deseja encontrar: ");
        resp = ler.next();
        try {
            val = Integer.parseInt(resp);
            for (int i = 0; i < tam; i++) {
                if (val == inv[i]) {
                    System.out.println("Valor encontrado " + inv[i] + "[" + (i) + "]");

                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido");
        }

    }
}
