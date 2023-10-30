package ListaDeExercicios3;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        raizQ();
    }

    static Scanner sc = new Scanner(System.in);

    //1. Elabore um programa que leia um número e calcule sua raiz quadrada. Caso a
    //raiz seja exata (quadrados perfeitos), informá-la, caso contrário, informe: “Não há
    //raiz exata para …”.

    //ARRUMAR ESTE EXERCICIO
    public static void raizQ(){
        double raiz;
        System.out.println("Digite o valor para saber a raiz: ");
        raiz = sc.nextInt();

        int valorInteiro = raiz;


        Math.sqrt(raiz);

        if(Math.sqrt(raiz) == Math.sqrt(raiz)){
            System.out.println("Raiz exata: " + Math.sqrt(raiz));
        } else if(Math.sqrt(raiz) != valorInteiro){
            System.out.println("Não ha raiz exata para" + raiz);
        }
    }

    //2. Elabore um programa que leia a velocidade permitida em uma estrada e a
    //velocidade de um condutor. Se a velocidade for inferior ou igual à permitida, exiba
    //“Sem multa”. Se a velocidade for de até 20% maior que a permitida, exiba “Multa
    //leve”. E, se a velocidade for superior a 20% da velocidade permitida, exiba “Multa
    //grave”.
    private static void radarVelocidade(){
        System.out.println("Qual a velocidade que o condutor passou: ");
        double velocidade = sc.nextDouble();

        double velocidadePermitida = 60.0;
        double velocidadeMaior = velocidadePermitida + 20 / 100;
        double valocidadeSuperior = v

    }
}
