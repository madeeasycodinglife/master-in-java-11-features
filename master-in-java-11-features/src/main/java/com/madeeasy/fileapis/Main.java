package com.madeeasy.fileapis;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        try {
            // this will create temporary file which is default provided by java .
            Path tempFilePath = Files.writeString(
                    Path.of(File.createTempFile("tempFile", ".tmp").toURI()),
                    "Welcome to madeeasy",
                    Charset.defaultCharset(), StandardOpenOption.WRITE);

            String fileContent = Files.readString(tempFilePath);
            System.out.println(fileContent);
            // Get file properties
            String absolutePath = tempFilePath.toAbsolutePath().toString();
            String fileName = tempFilePath.getFileName().toString();
            long fileSize = Files.size(tempFilePath);
            boolean isRegularFile = Files.isRegularFile(tempFilePath);
            boolean isDirectory = Files.isDirectory(tempFilePath);
            boolean isHidden = Files.isHidden(tempFilePath);
            // Print file properties
            System.out.println("Absolute Path: " + absolutePath);
            System.out.println("File Name: " + fileName);
            System.out.println("File Size: " + fileSize + " bytes");
            System.out.println("Is File: " + isRegularFile);
            System.out.println("Is Directory: " + isDirectory);
            System.out.println("Is Hidden: " + isHidden);
            System.out.println("File Content: " + fileContent);
            String tempDir = System.getProperty("java.io.tmpdir");
            //  C:\Users\<username>\AppData\Local\Temp\ <- this is for windows .
            System.out.println("Temporary directory: " + tempDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
