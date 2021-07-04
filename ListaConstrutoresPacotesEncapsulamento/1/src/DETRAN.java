import java.util.Scanner;

public class DETRAN {
    private String modelo;
    private int documento;


    public String getModelo(){
        return this.modelo;
    }
    static void setDocumento(int documento){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Documento do carro:");
        documento = teclado.nextInt();
        System.out.println("Documento registrado");
    }

}