package com.project.encoding_string.dataprocessing;

public class CloudFileDataProcessing implements FileDataProcessing {
    @Override
    public void writeFile(String path, String content) {
        // write to cloud
    }

    @Override
    public String readFile(String path) {
        // read from cloud
        return null;
    }
}
