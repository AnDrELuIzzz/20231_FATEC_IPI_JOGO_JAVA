public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    /*Isso é um metodo de instância */
    void cacar(){
        System.out.println(nome + "cacando");
    }

    void comer(){
        System.out.print(nome + "comendo\n");

    }

    void dormir(){
        System.out.printf("%s dormindo%n");
    }

    /*Para pular linha no windowns tem que colocar /r/n  no linux é \n , para pular linha idempendente da plataforma, coloca-se %n */
}
/*Classe com auto coesão -> classe faz somente uma coisa */