import java.util.Scanner;

public class locadora {
    private String modelo;
    private String placa;
    private int data;

    public void setData(int data){
        Scanner teclado = new Scanner(System.in);
        data = teclado.nextInt();
        if(data > 0){
            
            this.data = data;
            System.out.println("data válida");
        }else{
            System.out.println("Data inválida");
        }
    }
    public String getModelo(){
       return this.modelo;
    }
    public void setPlaca(String placa){

            this.placa = placa;
        }

}

