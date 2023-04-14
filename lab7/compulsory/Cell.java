package org.lab7.compulsory;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final List<Token> tokens;
    private boolean visited;

    public Cell() {
        tokens = new ArrayList<>();
        visited = false;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void addTokens(List<Token> tokens) {
        this.tokens.addAll(tokens);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "tokens=" + tokens +
                '}';
    }
}

