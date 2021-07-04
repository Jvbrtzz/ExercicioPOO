import java.util.Scanner;
public class revendedora {
    private String modelo;
    private double preco;


    public String getModelo() {
        return this.modelo;


    }    
    public void setPreco(double preco){
        Scanner teclado = new Scanner(System.in);
        preco = teclado.nextInt();
        if(preco > 1000){
            
            this.preco = preco;
            System.out.println("Preço aceito");
        }else{
            System.out.println("Preço não aceito");
        }
    }
}
