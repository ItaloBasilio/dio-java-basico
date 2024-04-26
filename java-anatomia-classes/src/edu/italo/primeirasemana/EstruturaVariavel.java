package edu.italo.primeirasemana;
public class EstruturaVariavel {

    public static void main (String [] args){
        EstruturaVariavel estrutura = new EstruturaVariavel();
        System.out.print(estrutura.anoFabricacao);
    }

    // Estrutura da variavel
    // tipo + NomeBemDefinido+ Atribuição

    int idade = 23;
    double altura = 1.62;

    String meuNome = "Italo Basilio";

    int anoFabricacao;

    public EstruturaVariavel() {
        anoFabricacao = 2023;
    }

}
