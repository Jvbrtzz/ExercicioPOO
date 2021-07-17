import java.util.Scanner;
public class DiaDaSemana extends diaUtil {
    public boolean ehDiaUtil(){
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        dia = teclado.nextInt();
        if (dia == Domingo){
            System.out.println(false);
            return false;
        }
        else if(dia == Segunda){
            System.out.println(true);
            return true;
        }else if(dia == Terça){
            System.out.println(true);
            return true;
        }else if(dia == Quarta){
            System.out.println(true);
            return true;
        }else if(dia == Quinta){
            System.out.println(true);
            return true;
        }else if(dia == Sexta){
            System.out.println(true);
            return true;
        }      
        else if(dia == Sabado){
            System.out.println(false);
            return false;
        }  

        return false;
}
}
