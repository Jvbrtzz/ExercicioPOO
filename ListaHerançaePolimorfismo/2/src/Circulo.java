import java.util.Scanner;

public class Circulo extends medidas {
    Scanner entrada = new Scanner(System.in);
    public double calcularArea (){
        
        area = 3.14*(raio*raio);
        
        return area;
    }
     
     
    public void imprimir(){
        
        System.out.println("Área: "+calcularArea());
    }
    
    void construtor(){
   System.out.println("Informe o raio do circulo:");
   raio = entrada.nextDouble();
}
}