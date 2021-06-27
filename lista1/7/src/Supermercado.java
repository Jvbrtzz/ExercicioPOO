import java.util.Scanner;
import java.util.Vector;
public class Supermercado {
    public static void main(String[] args){
   System.out.println("Escolha o produto: ");
    Scanner teclado = new Scanner(System.in);
    produto novoProduto =  new produto();

    cliente(novoProduto);

}

static void cliente(produto novo){
    int cont;
    Vector itens = new Vector();
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escolha o produto: ");
    novo.escolha = teclado.next();
    itens.add(novo.escolha);
    
    System.out.println("Adicionar mais itens? (Digite 1 para continuar)");
    cont = teclado.nextInt();
    while(cont == 1){
    
    System.out.println("Escolha o produto: ");
    novo.escolha = teclado.next();
    itens.add(novo.escolha);
    
    System.out.println("Adicionar mais itens?");
    cont = teclado.nextInt();

    
}
    System.out.println(itens);
}

}

