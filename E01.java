
// Online IDE - Code Editor, Compiler, Interpreter

import java.util.Scanner;

public class E01
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numUm = scanner.nextInt();
        System.out.println("Escreva um número: ");
        int numDois = scanner.nextInt();
        System.out.println("Escreva um número: ");
        int numTres = scanner.nextInt();
        
        int soma = numUm + numDois + numTres;
        
        System.out.println("A soma é: " + soma);
    }
}
