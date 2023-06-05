package com.chernenkov.task.reader;

import com.chernenkov.task.exception.CustomException;

import java.util.List;

public interface TextReader {
    public static final String DEFAULT_DIRECTORY = "./data";
    public static final String DEFAULT_FILENAME = "data\\defaultArrays.txt";
    public static final String SPACE_DELIMITER = "\\s+";
    List<String> readText(String fileName) throws CustomException;


}
