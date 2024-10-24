/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc09;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Revisao_exc09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int esC;

        System.out.println("Bem-vindo ao bistro Koji!");
        System.out.println("1(menu) 2(sair)");
        esC = ler.nextInt();
        if (esC == 1) {
            Menu();

        }else{
            System.out.println("Tchau, volte sempre");
        }

    }
    public static void Menu(){
        System.out.println("Carne de dinossauro\n" +
"\n" +
"Cordon Bleu\n" +
"\n" +
"Macarrao do meu pai\n" +
"\n" +
"Mexidao\n" +
"\n" +
"Suco de tamarindo\n" +
"\n" +
"Suco de laranja\n" +
"\n" +
"Suco de Uva\n" +
"\n" +
"Torteleta de banana\n" +
"\n" +
"Tortinha de limao\n" +
"\n" +
"Bolo de muranago");
    }
    
}
