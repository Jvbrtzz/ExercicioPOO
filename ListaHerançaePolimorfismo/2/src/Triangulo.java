import java.util.Scanner;
public class Triangulo extends medidas{
    Scanner entrada = new Scanner(System.in);
    double calcularArea (){
        
        area = (base*altura)/2;
        
        return area;
    }
     
     
    void imprimir(){
        
        System.out.println("Área: "+calcularArea());
    }
    
    void construtor(){
    System.out.println("Informe o valor da altura do triangulo:");
    base = entrada.nextDouble();
    System.out.println("Informe o valor da base do triangulo");
    altura = entrada.nextDouble();
    }    
}
