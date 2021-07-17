import java.util.Scanner;

public class novoMembro extends Pessoa {
    protected String membro;

    public void novoFamilia(String nome, int idade, String pai, String mae){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Novo membro? ");
        int m = teclado.nextInt();
        if(m == 1){
            System.out.println("Novo membro: ");
            String newmembro = teclado.next();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Pai: " + pai);
            System.out.println("Mãe: " + mae);
            System.out.println("novo membro: " + newmembro);
            


        }
        
    }
}
