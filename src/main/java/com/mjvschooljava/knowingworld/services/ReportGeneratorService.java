package com.mjvschooljava.knowingworld.services;

import java.util.List;

public class ReportGeneratorService {

    public static void generatedReport(List<String> lines) {
        int numberOfLinas = lines.size();
        int numberOfCharacters = lines.stream().mapToInt(String::length).sum();

        System.out.println("\nReport:");
        System.out.println("Number of lines: " + numberOfLinas);
        System.out.println("Number of characters: " + numberOfCharacters);
    }
}
