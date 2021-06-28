public class Bateria {
    double carga = 101;
    double capacidade = 11;

    void cargaUtilizada(double novaCarga ){
        carga = carga - novaCarga;
        System.out.println("o nivel da bateria é: " + carga);
    }
    void cargaCapacidade(double novaCapa ){
        capacidade = capacidade - novaCapa;
        System.out.println("o nivel da Capacidade é: " + capacidade);
    
    }
}
