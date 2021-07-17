import java.util.Scanner;
public class Quadrado extends medidas{
    

    Scanner entrada = new Scanner(System.in);
    double calcularArea (){
        
        area = lado*lado;
        
        return area;
    }
     
     
    void imprimir(){
        
        System.out.println("O quadrado de lado: "
                +lado+"\n Área: "+calcularArea());
    }
    
    void construtor(){
   System.out.println("Informe o valor do lado do quadrado");
        lado = entrada.nextDouble();
    }

}
