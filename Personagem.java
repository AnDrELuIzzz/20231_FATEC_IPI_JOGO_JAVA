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


/*A letra A significa: que foi adicionado e está pronto para fazer um commmit
  A letra M significa que o arquivo foi modificado
 Quando os arquivos estão verdes significa que esta em staged(pronto para um commit)
 A letra U significa que esta Untracked: não esta sendo monitorado pelo git 
*/