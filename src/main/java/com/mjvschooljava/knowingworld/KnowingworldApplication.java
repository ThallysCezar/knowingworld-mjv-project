package com.mjvschooljava.knowingworld;

import com.mjvschooljava.knowingworld.services.FilePrinterService;
import com.mjvschooljava.knowingworld.services.FileReaderService;
import com.mjvschooljava.knowingworld.services.ReportGeneratorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class KnowingworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowingworldApplication.class, args);

		String path = "C:/Workspace/Projetos-Pessoais/Mjv/knowingworld/doc-ref.txt";

		try {
			List<String> lines = FileReaderService.readFile(path);

			if (!lines.isEmpty()) {
				FilePrinterService.printLines(lines);
				ReportGeneratorService.generatedReport(lines);
			} else {
				System.out.println("\nThe file is empty.");
			}
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}

}
