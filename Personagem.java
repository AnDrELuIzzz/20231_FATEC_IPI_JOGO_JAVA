import static java.lang.Math.min;
public class Personagem{
    String nome;
    private int energia = 10 ;
    private int fome = 0;
    private int sono = 0;
    
    //construtor 
    public Personagem(int energia, int fome, int sono){
        //a variavel local prevalece, a global (shadow)
        System.out.println("Construindo um objeto...");
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }

    /*Isso é um metodo de instância */
    void cacar(){
        System.out.println(nome + " cacando");
        if (energia >= 2){
            System.out.println(nome + " cacando");
            //energia = energia -2;
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = Math.min(fome +1 , 10);
        System.out.println(obterEstado());
        
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo\n");
            energia = min(energia + 1,10);
            --fome;
        }
        else{
            System.out.println(nome + "Sem fome ");
        }
        System.out.println(obterEstado());
    }

    void dormir(){
        if(sono >= 1){//nãp tem como ficar menor que por conta dessa verficação 
        System.out.printf("%s dormindo%n",nome);
        energia = energia + 1 < 10?energia + 1 : 10;
        sono--;
        }
        else{
            System.out.println("Sem sono");
        }
        System.out.println(obterEstado());
    }

    String obterEstado(){
        return String.format("e(%d), s(%d), f(%d)", energia, sono, fome);
    }


    
    /*Para pular linha no windowns tem que colocar /r/n  no linux é \n , para pular linha idempendente da plataforma, coloca-se %n */
}
/*Classe com auto coesão -> classe faz somente uma coisa */


/*A letra A significa: que foi adicionado e está pronto para fazer um commmit
  A letra M significa que o arquivo foi modificado
  Quando os arquivos estão verdes significa que esta em staged(pronto para um commit)
  A letra U significa que esta Untracked: não esta sendo monitorado pelo git 
  -------------------------------------
  Não existe uma posição de memória "vazia"


  git diff 


  estado = coleção de valores que caracteriza o objeto naquele momento 
*/