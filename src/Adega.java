import java.util.*;
import java.lang.*;
import java.io.*;

public class Adega {
    private Vinho[] vinhos;
    public Adega(int quantVinhos){
        vinhos = new Vinho[quantVinhos];
        for(int i = 0; i < vinhos.length; i++){
            int ano = 1940 + (int)(Math.random() * 83);
            char[] tipos = {'T', 'B', 'R'};
            vinhos[i] = new Vinho(tipos[(int)(Math.random() * tipos.length)],ano);
        }
    }

    public double quantVinhosTinto(){
        int cont = 0;
        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'T')
                cont++;
        }
        double por_tinto = (double)(cont * 100) / vinhos.length;
        return Math.round(por_tinto * 100.0) / 100.0;
    }

    public double quantVinhosBranco(){
        int cont = 0;
        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'B')
                cont++;
        }
        double por_branco = (double)(cont * 100) / vinhos.length;
        return Math.round(por_branco * 100.0) / 100.0;
    }

    public double quantVinhosRose(){
        int cont = 0;
        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'R')
                cont++;
        }
        double por_rose = (double)(cont * 100) / vinhos.length;
        return Math.round(por_rose * 100.0) / 100.0;
    }

    public String toString(){
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'T')
                cont1++;
        }

        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'B')
                cont2++;
        }

        for(int i = 0; i < vinhos.length; i++){
            if(vinhos[i].getTipo() == 'R')
                cont3++;
        }
        return "Quantidade de vinhos da Adega: "+vinhos.length+"\nQuantidade de Vinho Tinto: "+cont1+
                "\nQuantidade de Vinho Branco: "+cont2+"\nQuantidade de Vinho Rosé: "+cont3;
    }
}
