public class Main_QA4 {
    public static void main(String[] args)  {
        
        TrabalhamHora joao = new TrabalhamHora(150,2,43);
        Assalariado lucas = new Assalariado(100);
        Comissionado vitor = new Comissionado(35);
        AssalariadoComissionado marco = new AssalariadoComissionado(200,35);

        System.out.println(joao.getSalario());
        System.out.println(lucas.getSalario());
        System.out.println(vitor.getSalario());
        System.out.println(marco.getSalario());
    }
}