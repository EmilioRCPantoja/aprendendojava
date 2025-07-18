/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args){
        Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = tamanhoDaTela.width, altura = tamanhoDaTela.height;

        System.out.println(largura + " x " + altura);
        

    } 

}