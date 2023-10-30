package ListaDeExercicios2;

import java.util.Scanner;

public class Main {
    public static void main(String Args[]) {
        fibonacci();
    }

    static Scanner sc = new Scanner(System.in);

    //1. Crie um programa que imprima "Olá, Mundo!" no console.
    private static void imprimirNome() {
        System.out.println("Renato");
    }

    //2. Escreva um programa que leia um número inteiro e determine se ele é par ou ímpar.
    private static void imparPar() {
        int numero = 0;

        System.out.println("Digite um numero:");
        sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("o numero é impar");
        }
    }

    //3. Desenvolva um programa que calcule e imprima a soma dos números de 1 a N, onde N é um número inteiro informado pelo usuário
    private static void calculoDoUsuario() {
        int total = 0;

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; ++i) {
            total = n + i;
            System.out.println(n + " + " + i + " = " + total);

        }
    }

    //4. Crie um programa que leia um número e verifique se ele é primo.
    private static void numerosPrimos() {
        System.out.println("Entre com um numero ");
        int num = sc.nextInt();

        for (int p = 2; p < num; p++) {

            if (num % p == 0) {
                System.out.println(num + " Não é primo");
            } else {
                System.out.println(p + " é um numero primo");
            }
        }
    }

    //5. Escreva um programa que leia uma sequência de números inteiros e determine o maior e o menor valor.
    private static void maiorMenor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a sequência de números: ");

        int maior, menor;

        int numero = sc.nextInt();
        maior = menor = numero;

        while (true) {
            numero = sc.nextInt();
            if (numero == 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }

    //6. Desenvolva um programa que leia uma string e verifique se é um palíndromo
    //(ou seja, se ela pode ser lida da mesma forma da esquerda para a direita e
    //vice-versa).
    private static void palindromo() {
    }

    //7. Crie um programa que solicite ao usuário que insira uma frase. Em seguida, o
    //programa deve contar e exibir a quantidade de vogais (a, e, i, o, u) na frase
    //inserida, ignorando letras maiúsculas e minúsculas. Por exemplo, "Olá, Mundo!"
    //deve ser considerado como tendo 4 vogais.
    private static void vogais() {
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        System.out.println("A frase tem " + contador + " vogais.");
    }

    //8. Crie um programa que gere os primeiros N termos da sequência de Fibonacci,
    //onde N é um número informado pelo usuário.
    private static void fibonacci() {
        int n;
        int a = 0;
        int b = 1;
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci que deseja gerar: ");
        n = sc.nextInt();

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
