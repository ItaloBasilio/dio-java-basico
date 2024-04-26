package edu.italo.primeirasemana;
public class Metodo {

    public static void main (String [] args){
        String primeiroNome = "Italo";
        String segundoNome = "Basilio";

                              //metodo
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);// semelhante ao console.log
    }

    //metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método = "+ primeiroNome.concat(" ").concat(segundoNome) ; 
    }
    
}
