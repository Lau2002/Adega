public class Principal {
    public static void main(String args[]){
        Adega a = new Adega((int)(Math.random() * 101));
        System.out.println("Adega de Vinhos:");
        while(true){
            System.out.println("\nDigite 'T' para consultar a porcentagem de Vinho Tinto;");
            System.out.println("Digite 'B' para consultar a porcentagem de Vinho Branco;");
            System.out.println("Digite 'R' para consultar a porcentagem de Vinho Rosé;");
            System.out.println("Digite 'F' para finalizar.");
            char tipo = Teclado.leChar();
            if(tipo == 'T' || tipo == 't')
                System.out.println("Porcentagem de Vinho Tinto: "+a.quantVinhosTinto()+"%");
            else if(tipo == 'B' || tipo == 'b')
                System.out.println("Porcentagem de Vinho Branco: "+a.quantVinhosBranco()+"%");
            else if(tipo == 'R' || tipo == 'r')
                System.out.println("Porcentagem de Vinho Rosé: "+a.quantVinhosRose()+"%");
            else if (tipo == 'F' || tipo == 'f')
                break;
            else
                System.out.println("\nOpção Inválida. Digite novamente:");
        }
        System.out.println(a.toString());
        System.out.println("\nPrograma Finalizado!");
    }
}
