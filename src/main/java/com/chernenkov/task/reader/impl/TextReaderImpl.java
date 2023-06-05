package com.chernenkov.task.reader.impl;

import com.chernenkov.task.exception.CustomException;
import com.chernenkov.task.reader.TextReader;
import com.chernenkov.task.validator.impl.WordValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReaderImpl implements TextReader {
    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> readText(String fileName) throws CustomException {
        String word;
        File file = null;
        File directory = new File(DEFAULT_DIRECTORY);
        file = new File(directory, fileName);
        if (!file.exists()) {
            logger.warn("File " + fileName + " is not exists");
            file = new File(DEFAULT_FILENAME);
        }
        List<String> wordList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            WordValidator wordValidator = new WordValidator();
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                String[] str = line.split(SPACE_DELIMITER);
                for (int i = 0; i < str.length; i++) {
                    word = str[i];
                    if (wordValidator.TextValidate(word)) {
                        wordList.add(word);
                    }
                }
            }
        } catch (IOException e) {
            throw new CustomException(e);
        }
        return wordList;
    }
}
