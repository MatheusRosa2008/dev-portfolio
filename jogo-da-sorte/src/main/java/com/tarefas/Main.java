package com.tarefas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {      // MATHEUS DAVI R. SILVA
        Scanner leitor = new Scanner(System.in);

        int numero = (int)(Math.random() * 100) + 1;
        String regraJogo, continuar = "";
        int escolha = 0, tentativas = 0;

        System.out.println("TENTE ADIVINHAR O NÚMERO DA SORTE");
        System.out.println("Deseja ver as regras do jogo?");
        System.out.println("Sim || Não");
        regraJogo = leitor.nextLine();
        if(regraJogo.equalsIgnoreCase("sim")){
            System.out.println("REGRAS");
            System.out.println("1. DIGITE APENAS NÚMEROS INTEIROS DE 1 à 100;");
            System.out.println("2. O PROGRAMA DIZERÁ SE ESTÁ PERTOU OU NÃO DO NÚMERO DA SORTE;");
            System.out.println("3. SE QUISER SAIR DO PROGRAMA DIGITE 0.");
        }

        do{
            System.out.print(":");
            escolha = leitor.nextInt();
            leitor.nextLine();
            if(escolha == numero){
                System.out.println("ACERTOU");
                tentativas++;
                break;
            } else if (escolha < 0 || escolha > 100) {
                System.out.println("ESCOLHA INVÁLIDA");
                System.out.println("DESEJA CONTINUAR? SIM/NÃO");
                continuar = leitor.nextLine();
                if(continuar.equalsIgnoreCase("sim")){
                    continue;
                } else break;
            }
             else if (escolha > numero) {
                System.out.println("MAIOR QUE O NÚMERO DA SORTE");
                tentativas++;
            } else if (escolha < numero) {
                System.out.println("MENOR QUE O NÚMERO DA SORTE");
                tentativas++;
            }
            if (tentativas == 3) {
                int x = (int)(Math.random() * numero);
                int y = numero - x;
                System.out.println("DICA: " + x + " + " + y + " = ?");
            }
        }while(escolha != 0);
        System.out.println("QUANTIDADE DE TENTATIVA " + tentativas);
    }                                                                  
}