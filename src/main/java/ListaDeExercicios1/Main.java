package ListaDeExercicios1;
//1. Crie uma função que imprime no console do terminal o seu nome.
public class Main {

    public static void main(String args[]){
        System.out.println("Renato");
        funcoes(10,2);
        classificatoria(17);
        concessionaria("Veloster", 55000);
        frete("Rio de Janeiro");

    }

//2. Crie uma função que receba dois números e imprime no console do terminal: a
//soma, subtração, multiplicação, divisão e o resto da divisão entre entre eles. Milha
//extra: caso o resultado da divisão seja um número decimal formate a saída para
//uma determinada quantidade de casas decimais.
    public static void funcoes(int n1, int n2){
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int resto = n1 % n2;

        System.out.println(
                "Funções entre os numeros" + n1 +" e " + n2 +
                        "\nSoma: " + soma +
                        "\nSubtração: " + subtracao +
                        "\nMultiplicacão: " + multiplicacao+
                        "\nDivisão: " + divisao +
                        "\nResto da divisão: " + resto);
    }

//3. Crie uma função que dada a idade de um usuário indique se ele pode ou não
//realizar a compra de um game. Considere: pessoas com idade superior a 16 anos
//podem efetuar a compra.
    public static void classificatoria(int idade){
        if (idade > 16){
            System.out.println("O usuario pode efetuar a compra!!");
        } else{
            System.out.println("O usuario não pode efetuar a compra");
        }
    }

//4. Você foi convidado para criar o algoritmo de cálculo do custo de frete do
//e-commerce Missouri para uma determinada cidade brasileira. Para cada bairro
//existirá um valor para a entrega das encomendas. Desenvolva uma função que
//dado o nome do bairro imprime no console, do terminal, o custo do frete
//associado.

    public static void frete(String cidade){
            switch (cidade){
                case "São Paulo":
                    System.out.println("O valor do frete é: R$" + 15.00);
                    break;
                case "Rio de Janeiro":
                    System.out.println("O valor do frete é: R$" + 20.00);
                    break;
                case "Rio Grande do Sul":
                    System.out.println("O valor do frete é: R$" + 23.00);
            }
    }



//5. Elaborar um programa para uma concessionária de veículos. O programa deve
//ler modelo e preço do veículo. Apresentar como resposta o valor da entrada (30%)
//e o saldo em 12x.
    public static void concessionaria(String modelo, double preco){
        double entrada = preco * 0.3;
        double saldo = (preco - entrada) / 12;

        System.out.println("Modelo: " + modelo +
                "\nPreço: R$" + preco +
                "\nValor de entrada: R$" + entrada +
                "\nSaldo em 12x: " + saldo);
    }

//6. A entrada para um clube de pesca custa R$20,00 por pessoa e cada pessoa
//    tem direito a levar um peixe. Peixes extras custam R$12,00. Elabore um programa
//    que leia o número de pessoas de uma família que foram ao clube e o número de
//    peixes obtidos na pescaria. Informe o total pago pela família

    private static void pesqueiro(int qtdPessoas, int qtdPeixes){
        double total = 0;
        if(qtdPessoas >= qtdPeixes){
            total = qtdPessoas * 20.00;
        } else{
            total = (qtdPessoas * 20.00) + (qtdPeixes - qtdPessoas) * 12;
        }
        System.out.println("O total da conta do pesqueiro: R$" + total);
    }

    //7. Elaborar um programa para uma veterinária, que leia o peso de uma ração em
    //Kg e o quanto um cachorro consome por dia da ração, em gramas. Informe
    //quantos dias irá durar a ração e o quanto sobra da ração (em gramas).
    private static void veterinaria(double pesoDaRacao, double consumo){
        double pesoEmGramas =  pesoDaRacao * 1000;
        int sobra = (int) (pesoDaRacao % consumo);
        int duracao = (int) (pesoEmGramas / consumo);

        System.out.println("Duraão da ração é: " + duracao);
        if (sobra == 0){
            System.out.println("Não teve sobra");
        } else {
            System.out.println("Sobrou: " + sobra);
        }
    }

    //O minimercado Ferreirinha necessita de um programa que leia o total de uma
    //compra. Exiba como resposta o nº máximo de vezes que o cliente pode parcelar
    //essa compra e o valor de cada parcela. Considere as seguintes condições: a) cada
    //parcela deve ser de, no mínimo, R$ 20,00; b) o número máximo de parcelas
    //permitido é 6

    private static void minimercado(double valorDaCompra){
        int parcelas = 0;
        int valoresParcela = (int) (valorDaCompra / 20.00);

        if (valoresParcela == 0){
            parcelas = 1;
        } else if (valoresParcela > 6){
            parcelas = 6;
        } else{
            parcelas = valoresParcela;
        }

        double valorParcela = valorDaCompra / parcelas;

        System.out.println("Pague em" + parcelas +" de" + valorParcela);
    }
}

