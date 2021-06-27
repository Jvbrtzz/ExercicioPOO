import java.util.Scanner;

public class Contato {
    public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
    
    Agenda novoContato = new Agenda();
    
    System.out.println("Digite o nome: ");
    novoContato.nome = teclado.next();
    
    System.out.println("Digite o numero: ");
    novoContato.numero = teclado.nextInt();
    
    imprimir(novoContato);

    }

    static void imprimir(Agenda novaAgenda){
        System.out.println("nome:"+ novaAgenda.nome);
        System.out.println("Número:"+ novaAgenda.numero);
    }
}
