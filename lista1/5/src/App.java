
import java.util.Scanner;


public class App{
    public static void main(String[] args){
    
    Televisao novaTV = new Televisao();

    continuar(novaTV);

    
    

    }
    static void continuar(Televisao con){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Aperte (1) para ligar a televião: ");
            con.estado = teclado.nextInt();
        if(con.estado == 1){
            
            System.out.println("Deseja escolher canal? (1 para continuar) ");
            con.cont = teclado.nextInt();

            while(con.cont == 1){
            System.out.println("Televisão está ligada");

            System.out.println("Escolha o canal: (0/99)");
            con.canal = teclado.nextInt();
    
            System.out.println("Volume: (0/100)");
            con.volume = teclado.nextInt();
            if(con.volume < 0)
            System.out.println("Silencioso");
    
            System.out.println("Deseja mudar de canal?");
            con.cont = teclado.nextInt();
            if(con.cont != 1){
                System.out .println("canal escolhido");
            }
            
            }
        }else{
            System.out .println("Televisão desligada");
             
         }
    }
}

   