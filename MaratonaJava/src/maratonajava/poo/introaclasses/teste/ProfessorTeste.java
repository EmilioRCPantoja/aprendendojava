
package maratonajava.poo.introaclasses.teste;

import maratonajava.poo.introaclasses.dominio.Professor;

public class ProfessorTeste {
    
    public static void main(String[] args)
    {
        Professor prof = new Professor();
        
        prof.nome = "Ladeira";
        prof.idade = 32;
        prof.sexo = 'm';
        
        if(prof.sexo == 77 || prof.sexo == 109){
            System.out.printf(" O Professor %s tem %d anos de idade\n", prof.nome, prof.idade);
        }
        else
        {
            System.out.printf(" A Professora %s tem %d anos de idade\n", prof.nome, prof.idade);
        }
    }
    
}
