import java.util.Scanner;

/*Crie um programa que contenha os seguintes métodos:
a. public static String dizerInformacao(String nome);
Deve retornar um texto dizendo: “ Meu nome é “ + nome .
b. public static String dizerInformacao(int idade);
Deve retornar um texto dizendo: “ Minha idade é “ + idade .
c. public static String dizerInformacao(double peso, double
altura);
Deve retornar um texto dizendo: “ Meu peso é “ + peso + “ e
minha altura é “ + altura .

Munido do retorno de cada um destes métodos. Imprima-o em tela. Para
praticarmos o uso da classe Scanner, leia estas quatro informações que
devem ser inseridas pelo usuário.*/
public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println(dizerInformação());

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade = ler.nextInt();
        System.out.println(dizerInformação(idade));


        System.out.print("Digite seu peso: ");
        double peso = ler.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = ler.nextDouble();
        System.out.println(dizerInformação(peso,altura));

    } public static String dizerInformação (){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.print("Meu nome é "+nome);
        return "";
    } public static String dizerInformação (int idade){
        System.out.print("Minha idade é "+idade);
        return String.valueOf("");

    } public static String dizerInformação (double peso, double altura){
        System.out.println("Minha altura é: "+altura);
        System.out.print(" Meu peso é: "+peso);

        return "";

    }
}

