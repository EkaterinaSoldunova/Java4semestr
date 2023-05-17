package com.example.sem4_pr12_PostConstruct_PreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

@Service
public class Files {

    @Value("${input:first.txt}")
    private String first;
    @Value("${output:second.txt}")
    private String second;

    private File fileInput, fileOutput;

    @PostConstruct
    private void init() {
        fileInput = new File(first);
        fileOutput = new File(second);
    }

    public void hash() {
        if (fileInput.exists()) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
                String content = new String(java.nio.file.Files.readAllBytes(Paths.get(first)));
                writer.write(DigestUtils.md5DigestAsHex(content.getBytes()));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
                writer.write("null");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(String input, String output) {
        this.first = input;
        this.second = output;
        init();
        hash();
    }

    @PreDestroy
    private void destroy(){
        fileInput.delete();
    }
}
