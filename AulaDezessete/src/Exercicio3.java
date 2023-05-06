import java.util.Scanner;

/*Escreva um método Java que recebe a nota de um aluno como um
        double e a classifique e retorne um char de acordo com as seguintes
        regras:
        a. Maior ou igual a 9,00 - A
        b. Maior ou igual a 8,0 e menor que 9,0 - B
        c. Maior ou igual a 7,0 e menor que 8,0 - C
        d. Maior ou igual a 6,0 e menor que 7,0 - D
        e. Menor que 6,0 - E  */
public class Exercicio3 {
    public static void main(String[] args) {
        System.out.print(notaDoAluno());

    } public static String notaDoAluno(){
        Scanner ler =new Scanner(System.in);
        System.out.print("Digite sua nota ");
        double nota = ler.nextDouble();

        if( nota >= 9.0){
        return "A";
        }else if (nota >= 8.0) {
            return "B";
        } else if (nota >= 7.0) {
       return "C";
        } else if (nota >= 6.0) {
            return "D";
        } else if (nota < 6.0);{
            return "E";}

    }

    }

