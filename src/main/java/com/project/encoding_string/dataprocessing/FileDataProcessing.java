package com.project.encoding_string.dataprocessing;

import java.io.IOException;

public interface FileDataProcessing {
    void writeFile(String path, String content) throws IOException;
    String readFile(String path) throws IOException;
}
