package com.alphacoder.designpattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class EncryptionDecorator implements FileOperator{
    private final FileOperator fileOperator;

    @Override
    public void writeFile() {
        encodeFile();
        fileOperator.writeFile();
    }

    @Override
    public void readFile() {
        decodeFile();
        fileOperator.readFile();
    }

    private void encodeFile(){
        log.info("Encoding data.");
    }

    private void decodeFile(){
        log.info("Decoding data.");
    }
}
