package mpa.persistence.generator;

import mpa.util.Log;

import java.util.ArrayList;

public class Warnings extends ArrayList<String> {

    public void print() {
        super.forEach(Log::warn);
    }
}
