import java.util.Scanner;

public class Celular {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    funcoes novaFuncao = new funcoes();
    Bateria novaBateria = new Bateria();
    System.out.println("Celular ligado!");
    System.out.println("Digite (1) para começar.");
    int cont = teclado.nextInt();
    while(cont == 1){
    
    
    System.out.println("-----------------------------------------------------");
    bateriaCarga(novaBateria);  
    System.out.println("-----------------------------------------------------");
    bateriaCapacidade(novaBateria);  
    System.out.println("-----------------------------------------------------"); 
    chamada(novaFuncao);
    System.out.println("Digite (1) se quiser continuar:"); 
    cont = teclado.nextInt(); 
    if(novaBateria.capacidade == 0){
        System.out.println("Voce esgotou toda capacidade do celular.");
        break; 
    }
   

}
    }
    static void chamada(funcoes novaCM){
        System.out.println("Digite (1) para chamar, ou (2) para mensagem");
        Scanner teclado = new Scanner(System.in);
        novaCM.operacao = teclado.nextInt();
        if (novaCM.operacao == 1){
            System.out.println("Digite o número para chamar:");
            novaCM.ligar = teclado.nextInt();
            System.out.println("Chamada em andamento");
        }else if(novaCM.operacao == 2){
            System.out.println("Digite o número para enviar a mensagem:");
            novaCM.ligar= teclado.nextInt();
            System.out.println("Digite a mensagem:");
            novaCM.mensagem = teclado.next();
            System.out.println("Enviando a mensagem...");

        }
    }
    static void bateriaCarga(Bateria novaCap){
        System.out.println("Estado atual da bateria");
        novaCap.cargaUtilizada(1);
        
    }
    static void bateriaCapacidade(Bateria novaCapacid){
        System.out.println("Estado atual da capacidade");
        novaCapacid.cargaCapacidade(1);
    }
}
