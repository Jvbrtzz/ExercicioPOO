import java.util.Scanner;

public class retangulo extends medidas {
    Scanner entrada = new Scanner(System.in);
    double calcularArea (){
        
        area = ladoMaior*lado;
        
        return area;
    }
     
     
    void imprimir(){
        
        System.out.println("Área: "+calcularArea());
    }
    
    void construtor(){
    System.out.println("Informe o valor do lado do retangulo:");
    lado = entrada.nextDouble();
    System.out.println("Informe o valor do lado da base do retangulo:");
    ladoMaior = entrada.nextDouble();
    }    
}
