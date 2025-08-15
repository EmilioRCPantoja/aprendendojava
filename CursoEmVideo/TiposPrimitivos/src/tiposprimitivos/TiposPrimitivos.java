/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author emi
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno(a):");
        String nome = input.nextLine();
        System.out.println("Digite a nota deste aluno(a)");
        float nota = input.nextFloat();
        System.out.printf("%s sua nota é de %.2f pontos\n", nome, nota);
    }
    
}
