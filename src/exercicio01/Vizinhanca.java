package exercicio01;

public class Vizinhanca {

    public static void compoeVizinhanca (Pais p1, Pais p2) { // o argumeto static, tira submissão deste metodo a variavel e traz para a classe
        p1.adicionarPaisContinente(p2);
        p2.adicionarPaisContinente(p1);

    }

}
