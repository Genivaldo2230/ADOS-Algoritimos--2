/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.alg2.ado_1_algoritimos2_tiposPrimitivos;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que receba como entrada do usuário um número inteiro
 * e devolva como saída esse mesmo número subtraído de 3.
 *
 * @author gda_a
 */
public class Ado_11_Algoritimos2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Numero ; ");
        int num1 = sc.nextInt();
        int num2 = 3;
        int num3 = num1-num2;

        
        System.out.println("Resposta " + num3);
    }
}