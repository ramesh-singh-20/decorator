package com.alphacoder.designpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleFileOperator implements FileOperator{

    @Override
    public void writeFile() {
        log.info("Writing data to a file.");

    }

    @Override
    public void readFile() {
        log.info("Reading data from a file.");
    }
}
