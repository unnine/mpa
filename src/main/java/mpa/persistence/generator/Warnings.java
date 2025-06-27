package mpa.persistence.generator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Warnings extends ArrayList<String> {

    public void print() {
        super.forEach(log::warn);
    }
}
