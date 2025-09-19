
package maratonajava.poo.introametodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
}
    
    public void subtraiDoisNumeros(){
        System.out.println(21 - 4);
    }
    
    public void multiplicaDoisNumeros(int n1,  int n2){
        System.out.println(n1 * n2);  
    }
    
    public double divideDoisNumeros(float num, float div){
        double res = num / div;
        return res;
    }
    
    public double identificaPar(double n){
        double n2;
        
        n2 = n % 2;
        
        if( n2 == 0){
            return 0;
        }
        else{
            return n2;
        }
    }
        
    public void imprimePar(double n){
        if(n % 2 == 0 )
        {
            System.out.println("é par");
        }
        else
        {
            System.out.println("não é par");
        }
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int i: numeros ){
            soma += i;
        }

        System.out.println("a soma dos elementos do array é igual a: "+soma);
    }

    //     após usar VarArgs não se pode passar nenhum outro parametro
    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for(int i:numeros){
            soma +=i;
        }

        System.out.println(" a soma dos VarArgs é igual a: " + soma);

    }
    
}
