public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesl;
    

public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
public Data(int dia,String mesl,  int ano){
        this.mesl = mesl;
        this.mes = mes;
        this.ano = ano;
    }
public Data(int dia, int ano){
        this.dia = dia;
        this.ano = ano;
    }

public void setDia(int dia){
        this.dia = dia;
}


    public int getDia() {
    return this.dia;
    }
public int getMes() {
    return this.mes;
    }
public int getAno() {
    return this.ano;
    }
public String getMesl(){
    return this.mesl;
}
}