import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o estilo de data preferida?");
    System.out.println("(1) DD/MM/AAAA");
    System.out.println("(2) 8, AGOSTO, 2007");
    System.out.println("(3) DDD/AAAA");
    int n = teclado.nextInt();

    if(n == 1){
    System.out.println("Dia: ");
    int getDia = teclado.nextInt();
    System.out.println("Mes: ");
    int getMes = teclado.nextInt();
    System.out.println("Ano ");
    int getAno = teclado.nextInt();
    Data data1 = new Data(getDia, getMes, getAno);
    ImprimirData1(data1);
    }if(n == 2){
        System.out.println("Dia: ");
        int getDia = teclado.nextInt();
        System.out.println("Mes: ");
        String getMesl = teclado.next();
        System.out.println("Ano: ");
        int getAno = teclado.nextInt();
        Data data1 = new Data(getDia, getMesl, getAno);
        ImprimirData2(data1);
    }if(n == 3){
        System.out.println("Dia: ");
        int getDia = teclado.nextInt();
        System.out.println("Ano: ");
        int getAno = teclado.nextInt();
        Data data1 = new Data(getDia, getAno);
        ImprimirData3(data1);
    
    }

    
}
static void ImprimirData1(Data nova){
    
    System.out.println("Dia: " + nova.getAno());
    System.out.println("Mes: " + nova.getMes());
    System.out.println("Ano: " + nova.getAno());
        
}


static void ImprimirData2(Data nova){
    System.out.println("Dia: " + nova.getAno());
    System.out.println("Mes: " + nova.getMesl());
    System.out.println("Ano: " + nova.getAno());
}

static void ImprimirData3(Data nova){
    System.out.println("Dia: " + nova.getAno());
    System.out.println("Ano: " + nova.getAno());
}

}
