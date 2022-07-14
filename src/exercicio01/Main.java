package exercicio01;

public class Main {

    public static void main(String[] args) {

        //criando o pais referencia para constar vizinhança ou não
        Pais nome1 = new Pais("BRA","Brasil","América do Sul",212600000,8516000);
        System.out.println();
        System.out.println("O nome do país informado foi: "+nome1.getNomePais()+"\nA sigla do país é: "+nome1.getComposicaoIso()+"\nA dimensão total é de "+nome1.getTamPais()+" km²");
        System.out.println("O tamanho da população total é de "+nome1.getTamPop()+" de habitantes");
        System.out.println("A densidade demografica do país é de: "+nome1.calculoDeDensidadeDemografica()+" Hab/Km²");

        //criando os paises que terão ou não vizinhança
        Pais nome2 = new Pais("USA","Estados Unidos","América do Norte",329500000,9834000);
        Pais nome3 = new Pais("ARG","Argentina","América do Sul",45380000,2780000);
        Pais nome4 = new Pais("URU","Uruguai","América do Sul",3474000,176215);
        Pais nome5 = new Pais("COL","Colômbia","América do Sul",50880000,1142000);

        //execuntando o metodo de tornar o pais vizinho do outro
        Vizinhanca.compoeVizinhanca(nome1,nome3); //Brasil vizinho Argentina
        Vizinhanca.compoeVizinhanca(nome3,nome1); //Argentina vizinho Brasil
        Vizinhanca.compoeVizinhanca(nome1,nome4); //Brasil vizinho Uruguai
        Vizinhanca.compoeVizinhanca(nome4,nome1); //Uruguai vizinho Brasil
        Vizinhanca.compoeVizinhanca(nome1,nome5); //Brasil vizinho Colômbia
        Vizinhanca.compoeVizinhanca(nome5,nome1); //Colômbia vizinho Brasil

        //executando o metodo que verifica se há fronteira (vizinhança) ou não com o pais referencia linha 8
        System.out.println();
        nome1.identificaVizinhos(nome2);
        nome1.identificaVizinhos(nome3);
        nome1.identificaVizinhos(nome4);
        nome1.identificaVizinhos(nome5);

        System.out.println();
        nome1.paisesDoContinente();


    }




}
