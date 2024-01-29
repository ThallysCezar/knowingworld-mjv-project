package com.mjvschooljava.knowingworld.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

    public static List<String> readFile(String path) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

}
