package com.matheus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha, continuar = 0;
        double[] numero = new double[2];
        double resultado = 0;

        String 
        menu = """
            ====================
            =====CALCULADORA====
            ====================
            (1)SOMAR;
            (2)SUBTRAIR;
            (3)DIVIDIR;
            (4)MULTIPLICAR;
            (0)SAIR.""".stripIndent(),

        mensagemPrimeiroNumero = """
            DIGITE O PRIMEIRO NÚMERO: """.stripIndent(),

        mensagemSegundoNumero = """
            DIGITE O SEGUNDO NÚMERO: """.stripIndent(),

        respostaFinal = """
            RESULTADO: """.stripIndent(),
        
        desejaContinuar = """
                DESEJA CONTINUAR? """.stripIndent();

        do{
            System.out.println(menu);
            System.out.print("DIGITE: ");
            escolha = leitor.nextInt();

            if(escolha < 0 || escolha > 4){
                System.out.println("ESCOLHA INVÁLIDA.");
                continue;
            }
            if(escolha == 0){
                System.out.println("Saindo...");
                break;
            }   
        
            switch (escolha) {
                case 1:
                    System.out.print(mensagemPrimeiroNumero);
                    numero[0] = leitor.nextDouble();
                    System.out.print(mensagemSegundoNumero);
                    numero[1] = leitor.nextDouble();

                    resultado = numero[0] + numero[1];

                    System.out.println(respostaFinal + resultado);

                    System.out.println(desejaContinuar);
                    System.out.println("(0) NÃO || (1) SIM");
                    System.out.print("DIGITE: ");
                    continuar = leitor.nextInt();

                    if(continuar < 0 || continuar > 1){
                        System.out.println("RESPOSTA INVÁLIDA");
                        break;
                    } else if (continuar == 1){
                        System.out.println("CONTINUANDO O PROGRAMA...");
                        break;
                    } else {
                        continuar = 0;
                        break;
                    }
                case 2:
                    System.out.print(mensagemPrimeiroNumero);
                    numero[0] = leitor.nextDouble();
                    System.out.print(mensagemSegundoNumero);
                    numero[1] = leitor.nextDouble();
                    
                    resultado = numero[0] - numero[1];

                    System.out.println(respostaFinal + resultado);

                    System.out.println(desejaContinuar);
                    System.out.println("(0) NÃO || (1) SIM");
                    System.out.print("DIGITE: ");
                    continuar = leitor.nextInt();

                    if(continuar < 0 || continuar > 1){
                        System.out.println("RESPOSTA INVÁLIDA");
                        break;
                    } else if (continuar == 1){
                        System.out.println("CONTINUANDO O PROGRAMA...");
                        break;
                    } else {
                        continuar = 0;
                        break;
                    }
                case 3:
                    System.out.print(mensagemPrimeiroNumero);
                    numero[0] = leitor.nextDouble();
                    System.out.print(mensagemSegundoNumero);
                    numero[1] = leitor.nextDouble();
                    
                    resultado = numero[0] / numero[1];

                    System.out.println(respostaFinal + resultado);

                    System.out.println(desejaContinuar);
                    System.out.println("(0) NÃO || (1) SIM");
                    System.out.print("DIGITE: ");
                    continuar = leitor.nextInt();

                    if(continuar < 0 || continuar > 1){
                        System.out.println("RESPOSTA INVÁLIDA");
                        break;
                    } else if (continuar == 1){
                        System.out.println("CONTINUANDO O PROGRAMA...");
                        break;
                    } else {
                        continuar = 0;
                        break;
                    }
                case 4:
                    System.out.print(mensagemPrimeiroNumero);
                    numero[0] = leitor.nextDouble();
                    System.out.print(mensagemSegundoNumero);
                    numero[1] = leitor.nextDouble();
                    
                    resultado = numero[0] * numero[1];

                    System.out.println(respostaFinal + resultado);

                    System.out.println(desejaContinuar);
                    System.out.println("(0) NÃO || (1) SIM");
                    System.out.print("DIGITE: ");
                    continuar = leitor.nextInt();

                    if(continuar < 0 || continuar > 1){
                        System.out.println("RESPOSTA INVÁLIDA");
                        break;
                    } else if (continuar == 1){
                        System.out.println("CONTINUANDO O PROGRAMA...");
                        break;
                    } else {
                        continuar = 0;
                        break;
                    }  
            }
        }while(continuar != 0);    
    }
}