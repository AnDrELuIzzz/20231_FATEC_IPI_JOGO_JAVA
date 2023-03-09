public class TestePersonagem {
    public static void main(String[] args)throws Exception {
       
        //java 10+
        /*var p = new Personagem;*/
        //int idade =  18;
        
       //System.out.println(idade >= 18? "Sim": "nao");
       Personagem p = new Personagem(2, 4, 10); /*p é uma variavel de referencia(um ponteiro)  OBJETO p*/
        p.nome = "Jhown";
       while(true){
        p.cacar();
        Thread.sleep(5000);
        p.comer();
        Thread.sleep(5000);
        p.dormir();
        Thread.sleep(5000);
        p.cacar();
        Thread.sleep(5000);
        p.cacar();
        Thread.sleep(5000);
        p.cacar();
        Thread.sleep(5000);

        System.out.println("=========================================");
        Thread.sleep(10000);
       }

        
    }


   
}