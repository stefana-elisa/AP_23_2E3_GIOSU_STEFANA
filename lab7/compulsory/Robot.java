package org.lab7.compulsory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robot implements Runnable {
    private String name;
    private boolean running;
    private final Exploration exp;
    public final SharedMemory mem;

    private int x;
    private int y;
    private final List<Token> tokens;

    public Robot(String name, Exploration exp, SharedMemory mem) {
        this.name = name;
        this.exp = exp;
        this.mem = mem;
        tokens = new ArrayList<>();
        this.running = true;
    }

    public void setRunning(boolean running){
        this.running=running;
    }

    public String getName() {
        return name;
    }

    public List<Token> getExtractedTokens() {
        return tokens;
    }

    public void run() {
        while(running) {
            Random random = new Random();
            int row = random.nextInt(exp.getMap().getN());
            int column = random.nextInt(exp.getMap().getN());

            exp.getMap().visit(row, column, this);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
