public class Pessoa {
    String nome;
    int idade;

    void anoPassou(int anos){
        idade = idade + anos;
    }

    void maisUmAno(){
        System.out.println("Parabésn pelo aniversário!");
}
}