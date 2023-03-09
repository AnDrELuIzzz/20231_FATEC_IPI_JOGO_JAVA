public class TestePersonagem {
    public static void main(String[] args) {
        Personagem p = new Personagem(); /*p é uma variavel de referencia(um ponteiro)  OBJETO p*/
        //java 10+
        /*var p = new Personagem;*/

        p.nome = "John";
        p.cacar();
        p.comer();
        p.dormir();
    }
}
