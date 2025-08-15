/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) throws Exception {
        Locale idioma = Locale.getDefault();
        String nomeIdioma =  idioma.getDisplayLanguage();

        System.out.println("o seu dispositivo está em: " + nomeIdioma);
    }
}