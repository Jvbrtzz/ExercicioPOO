public class Main_3 {
    
        public static void main(String[] args) {
            PessoaFisica joao = new PessoaFisica("João", "131.909.154-65", "Paracuru", "23/06");
            PessoaFisica victor = new PessoaFisica("Victor", "131.969.354-65", "Mangaratiba", "22/03");
            PessoaFisica paulo = new PessoaFisica("Paulo", "156.409.144-65", "Campo Grande", "12/8");
            PessoaFisica ana = new PessoaFisica("Ana", "155.903.153-63", "Pará", "23/06");
    
            PessoaJuridica oms = new PessoaJuridica("OMS","09.266.344/0001-11", "Córrego dos Colibris", 0 );
            PessoaJuridica riot = new PessoaJuridica("Riot","29.234.332/0998-11", "Subterrâneo", 678787 );
    
            Agenda.addAgenda(joao);
            Agenda.addAgenda(victor);
            Agenda.addAgenda(paulo);
            Agenda.addAgenda(ana);
            Agenda.addAgenda(oms);
            Agenda.addAgenda(riot);
    
            PessoaFisica.buscaPF("131.909.154-65");
            PessoaFisica.buscaPF("156.409.144-65");
            PessoaFisica.buscaPF("126.409.144-65");
    
            PessoaJuridica.buscaPJ("09.266.344/0001-11");
    
            PessoaJuridica.buscaPJ("4532454262");
    
            System.out.println();
            Agenda.imprimeAgendaPF(Agenda.agendaPF);
            System.out.println();
            Agenda.imprimeAgendaPJ(Agenda.agendaPJ);
        }
    
    }

