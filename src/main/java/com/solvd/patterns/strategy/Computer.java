package com.solvd.patterns.strategy;

public class Computer {

    private String type;
    private Program program;

    public Computer() {
        program = new HomeScreen();
    }

    public String getType() {
        return type;
    }

    public void useProgram() {
        program.activate();
    }

    public void closeProgram() {
        program.close();
    }

    public void setType(String type) {
        this.type = type;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
