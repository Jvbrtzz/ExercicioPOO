import java.util.Scanner;

public class EstadoDaPorta {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Porta novaPorta = new Porta();

    System.out.println("Qual a cor da porta? ");
    novaPorta.cor = teclado.next();
    
    System.out.println("Qual o tamanho da porta? (Pequena/Media/Grande)");
    novaPorta.tamanho =  teclado.next();

    System.out.println("A porta está aberta ou fechada? (1 = aberta) (0 = fechada)");  
    novaPorta.estado = teclado.nextInt();

    
    imprimir(novaPorta);
    
    estaAberta(novaPorta);

        
    }
    static void imprimir(Porta novo){
        System.out.println("Sua porta está assim:");
        System.out.println("Tamanho:"+ novo.tamanho);
        System.out.println("Cor:"+ novo.cor);
        
        

    }
    static void estaAberta(Porta comoEsta){
        if (comoEsta.estado == 1){
            System.out.println("A porta está aberta");
        
        
        }
        else if(comoEsta.estado == 0){
            System.out.println("A porta está fechada");
        }
        
    }

    
}
