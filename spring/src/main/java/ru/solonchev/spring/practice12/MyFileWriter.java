package ru.solonchev.spring.practice12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
@Data
@Slf4j
public class MyFileWriter {
    private static final String FILE_FROM = "C:\\Users\\Mark\\IdeaProjects\\JavaPatternsMirea\\spring\\src\\main\\java\\ru\\solonchev\\spring\\practice12\\texts\\file1.txt";
    private static final String FILE_TO = "C:\\Users\\Mark\\IdeaProjects\\JavaPatternsMirea\\spring\\src\\main\\java\\ru\\solonchev\\spring\\practice12\\texts\\file2.txt";

    //@PostConstruct
    public void init() {
        log.info("File Writer Started");
    }

    //@PreDestroy
    public void preDestroy() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_TO));
        if (new File(FILE_FROM).exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_FROM));
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
            bufferedWriter.write(String.valueOf(text.hashCode()));
            log.info("Okay!");
            bufferedReader.close();
        } else {
            bufferedWriter.write("null");
            log.info("I have a trouble");
        }
        bufferedWriter.close();
    }
}
