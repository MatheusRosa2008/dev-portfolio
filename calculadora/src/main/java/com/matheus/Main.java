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
        RESULTADO: """.stripIndent(); 

        do{
            System.out.println(menu);
            System.out.print("DIGITE: ");
            escolha = leitor.nextInt();

            if(escolha < 0 || escolha > 4){
                System.out.println("ESCOLHA INVÁLIDA.");
                System.out.println("DESEJA CONTINUAR O PROGRAMA?");
                System.out.println("(0) NÃO || (1) SIM");
                continuar = leitor.nextInt();
            }   
        }while(escolha < 0 || escolha > 4 && escolha == 0); 
        
        switch (escolha) {
            case 1:
                System.out.print(mensagemPrimeiroNumero);
                numero[0] = leitor.nextDouble();
                System.out.print(mensagemSegundoNumero);
                numero[1] = leitor.nextDouble();

                resultado = numero[0] + numero[1];

                System.out.println(respostaFinal + resultado);
                break;
            case 2:
                System.out.print(mensagemPrimeiroNumero);
                numero[0] = leitor.nextDouble();
                System.out.print(mensagemSegundoNumero);
                numero[1] = leitor.nextDouble();
                
                resultado = numero[0] - numero[1];

                System.out.print(respostaFinal + resultado);
                break;
            case 3:
                System.out.print(mensagemPrimeiroNumero);
                numero[0] = leitor.nextDouble();
                System.out.print(mensagemSegundoNumero);
                numero[1] = leitor.nextDouble();
                
                resultado = numero[0] / numero[1];

                System.out.print(respostaFinal + resultado);
                break;
            case 4:
                System.out.print(mensagemPrimeiroNumero);
                numero[0] = leitor.nextDouble();
                System.out.print(mensagemSegundoNumero);
                numero[1] = leitor.nextDouble();
                
                resultado = numero[0] * numero[1];

                System.out.print(respostaFinal + resultado);
                break;
        }
    }
}