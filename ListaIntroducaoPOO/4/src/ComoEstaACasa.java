import java.util.Scanner;



public class ComoEstaACasa {
    public static void main(String[] args)  {
    Scanner teclado =  new Scanner(System.in);
    Casa novaCasa = new Casa();
    

    System.out.println("Qual será a cor da Casa? ");
    novaCasa.cor = teclado.next();
    
    System.out.println("A porta um está? (1 = aberta) (0 = fechada)");
    novaCasa.portaUm =  teclado.nextInt();

    System.out.println("A porta dois está? (1 = aberta) (0 = fechada)");
    novaCasa.portaDois =  teclado.nextInt();

    System.out.println("A porta tres está? (1 = aberta) (0 = fechada)");
    novaCasa.portaTres=  teclado.nextInt();

    quantasPortasEstaoAbertas(novaCasa);

    }
    
    
    static void quantasPortasEstaoAbertas(Casa comoEsta){
        int cont = 0;
        int contUm = 0;
        int contDois = 0;
        int contTres = 0;
        if( comoEsta.portaUm == 1){
            contUm += 1;
        }
        if(comoEsta.portaDois == 1){
            contDois += 1;
        }
        if(comoEsta.portaTres ==1){
            contTres += 1;
        }
        cont = contUm + contDois + contTres;
        
        System.out.println("Sua casa está assim:");
        System.out.println("Cor: "+ comoEsta.cor);
        System.out.println("A quantidade de portas abertas é: " + cont);
    
    }
        
       
        
    }


