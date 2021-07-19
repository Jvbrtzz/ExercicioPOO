public class main_1 {
    public static void main(String[] args) throws Exception {
        Pessoa novaPessoa =  new Pessoa();
        novaPessoa.arvoreGenelogica("João", 22, "Willian", "Salete");
        novaPessoa.setNome("Victor");
        novaPessoa.imprimir();
        novoMembro novomembro = new novoMembro();
        novomembro.novoFamilia("João", 22, "Willian", "Salete");
        
    }
}
