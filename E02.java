
// Online IDE - Code Editor, Compiler, Interpreter

import java.util.Scanner;

public class E02
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numUm = scanner.nextInt();
        System.out.println("Escreva um número: ");
        int numDois = scanner.nextInt();
        
        int sub = numUm - numDois;
        int multi = numUm * numDois;
        int div = numUm / numDois;
        
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + multi);
        System.out.println("A divisão é: " + div);
    }
}
