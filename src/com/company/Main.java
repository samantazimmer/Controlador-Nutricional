package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = calcularIMC(peso, altura);

        System.out.println("\n--- Resultados ---");
        System.out.println("Nome: " + nome);
        System.out.printf("IMC: %.2f\n", imc);

        // Cálculo da média de consumo de carboidratos e proteínas
        double mediaCarboidratos = calcularMediaCarboidratos(peso);
        double mediaProteinas = calcularMediaProteinas(peso);
        double quantidadeAgua = calcularQuantidadeAgua(peso);

        System.out.printf("Média de consumo de carboidratos nas refeições: %.1fg\n", mediaCarboidratos);
        System.out.printf("Média de consumo de proteínas nas refeições: %.1fg\n", mediaProteinas);
        System.out.printf("Quantidade recomendada de água por dia: %.1fl\n", quantidadeAgua);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularMediaCarboidratos(double peso) {
        // Cálculo aproximado da média de consumo de carboidratos (em gramas)
        return peso * 3.5;
    }

    public static double calcularMediaProteinas(double peso) {
        // Cálculo aproximado da média de consumo de proteínas (em gramas)
        return peso * 2.2;
    }

    public static double calcularQuantidadeAgua(double peso) {
        // Cálculo aproximado da quantidade recomendada de água (em mililitros)
        return peso * 35;
    }
}
