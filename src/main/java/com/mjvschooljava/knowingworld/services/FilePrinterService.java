package com.mjvschooljava.knowingworld.services;

import java.util.List;

public class FilePrinterService {

    public static void printLines(List<String> lines) {
        System.out.println("\nFile contents:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
