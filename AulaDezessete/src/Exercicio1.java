
/*Crie um programa que pode controlar o volume e trocar os canais
da televisão. O controle de volume permite:
a. aumentar ou diminuir a potência do volume de som em uma
unidade de cada vez;
b. aumentar e diminuir o número do canal em uma unidade
trocar para um canal indicado;
c. consultar o valor do volume de som e o canal selecionado.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println((trocaDeCanais()) + (volumeAlteração()));
        System.out.println();

    }public static String trocaDeCanais () {
        Scanner ler = new Scanner(System.in);
        String troca;

        System.out.println("-------------------------------");
        System.out.println(" EXIBIÇÃO DO CANAL [001 GLOBO] ");
        System.out.println("-------------------------------");
        System.out.println("Deseja trocar de canal?----------SIM--------NÃO------");
        troca = ler.next();

        switch (troca) {
            case "Não","não": {
                System.exit(0);
            }
            case "SIM", "sim": {
                System.out.println("QUAL CANAL VOCÊ DESEJA EXIBIR?");
                System.out.println("Globo -- 001, Record -- 002, Sbt -- 003 ");
                System.out.println("=========================================");
                System.out.println("Digite o numero do canal: ");
                int exibir = ler.nextInt();
                switch (exibir) {
                    case 001: {
                        System.out.println("Você está assistindo --- 001'Globo");
                    }
                    case 002: {
                        System.out.println("Você está assistindo --- 002'Record");
                        break;
                    }
                    case 003: {
                        System.out.println("Você está assistindo --- 003'Sbt");
                        break;
                    }
                }

            }
        }
        return troca;
    }public static String volumeAlteração () {
                Scanner ler =new Scanner(System.in);
                System.out.println("=======================");
                System.out.println(" VOLUME DO SOM "); // concatenar com a quantidade do volume que for escolher
                System.out.println("=======================");
                System.out.println("Deseja alterar??------SIM-------NÃO-------");
                String alteração = ler.next();

                switch (alteração) {
                    case "SIM", "sim": {
                        System.out.println("Digite quantos por cento  você quer alterar");
                        int volume = ler.nextInt();
                        if (volume < 100) {
                            System.out.println("Volume aumentado para " + volume + "%");
                            break;
                        } else if (volume == 100) {
                            System.out.println("Volume está no máximo");
                        }

                    }
                    case "NÃO", "não": {
                        System.exit(0);}
                }
        return "";
    };
}
