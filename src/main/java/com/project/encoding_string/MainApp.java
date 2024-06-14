package com.project.encoding_string;

import com.project.encoding_string.dataprocessing.FileDataProcessing;
import com.project.encoding_string.dataprocessing.SystemFileDataProcessing;
import com.project.encoding_string.encoder.Encoder;

import java.io.IOException;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {

		String encodingType = "ascii";

		String filePath = args[0];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a key:");
		int key = Integer.parseInt(scanner.nextLine());

		System.out.println("Key = " + key);

		Encoder encoder = new Encoder();
		FileDataProcessing fileDataProcessing = new SystemFileDataProcessing();

		try {
			String content = fileDataProcessing.readFile(filePath);

			String encodedContent;
			switch (encodingType.toLowerCase()) {
				case "ascii":
					encodedContent = encoder.encodeToAscii(content);
					break;
				case "sha256":
					encodedContent = encoder.encodeToBase64(content);
					break;
				case "base64":
					encodedContent = encoder.encodeToBase64(content);
					break;
				default:
					System.out.println("Invalid encoding type. Please choose 'ascii' or 'base64'.");
					return;
			}

			fileDataProcessing.writeFile(filePath, key + " encoded data = " + encodedContent);
			System.out.println("Encoded content written to " + filePath);
		} catch (IOException e) {
			System.err.println("Error reading or writing file: " + e.getMessage());
		}
	}

}
