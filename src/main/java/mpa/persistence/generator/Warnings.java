package mpa.persistence.generator;

import java.util.ArrayList;

public class Warnings extends ArrayList<String> {

    public void print() {
        super.forEach(System.err::println);
    }
}
