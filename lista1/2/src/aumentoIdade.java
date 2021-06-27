import java.util.Scanner;

public class aumentoIdade {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    Pessoa aniversario = new Pessoa();

    System.out.println("digite o nome: ");
    aniversario.nome = teclado.next();

    System.out.println("Digite idade: ");
    aniversario.idade = teclado.nextInt();
     
    imprimir(aniversario);
    
    aniversario.maisUmAno();
    aniversario.anoPassou(1);
    
    imprimir(aniversario);

    aniversario.maisUmAno();
    aniversario.anoPassou(1);
    
    imprimir(aniversario);
       
    }
    static void imprimir(Pessoa novoAniversario){
        System.out.println("nome:"+ novoAniversario.nome);
        System.out.println("Número:"+ novoAniversario.idade);
}
}