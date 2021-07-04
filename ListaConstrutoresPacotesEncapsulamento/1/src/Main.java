import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int cont;
        int cont2;
        Scanner teclado = new Scanner(System.in);
        Carro novoCarro = new Carro("Sandeiro", "XZC - 8212");
        locadora novaLocadora = new locadora();
        revendedora novaRevendedora = new revendedora();
        Mecanica novaMecanica = new Mecanica();
        DETRAN novoDetran =  new DETRAN();
        imprimir(novoCarro);
        System.out.println("Data: ");
        
        novaLocadora.setData(1);
        System.out.println("Deseja vender o carro? (1) sim, (2)não");
        cont = teclado.nextInt();
           
        if (cont == 1){
            imprimir(novoCarro);
            System.out.println("Qual o valor desejado?");
            novaRevendedora.setPreco(1);
        }else{
            System.out.println("Venda recusada");
        } 
        System.out.println("O Carro necessita reparos?  (1) sim, (2)não"); 
        cont2 = teclado.nextInt();
        if(cont2 == 1){
            novaMecanica.setParte("parte");
            novaMecanica.setReparo(0);

        }else{
            System.out.println("Carro não necessita");
        }
        novoDetran.setDocumento(1);

    }
    static void imprimir(Carro novo){
        System.out.println("Modelo:" +novo.getModelo());
        System.out.println("placa:" +novo.getPlaca());
    }
    
}

