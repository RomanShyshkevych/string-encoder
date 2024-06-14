package com.project.encoding_string.encoder;

import java.util.Base64;

public class Encoder {

    public String encodeToAscii(String sentence) {
        StringBuilder asciiEncoded = new StringBuilder();
        for (char ch : sentence.toCharArray()) {
            asciiEncoded.append((int) ch).append(" ");
        }
        return asciiEncoded.toString().trim();
    }

    public String encodeToBase64(String sentence) {
        return Base64.getEncoder().encodeToString(sentence.getBytes());
    }
}
