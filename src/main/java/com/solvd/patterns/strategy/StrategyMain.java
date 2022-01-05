package com.solvd.patterns.strategy;

/*
Данный паттерн можно использовать, если реализация какого-то метода может меняться
во время выполнения программы. Зарегистрированный/незарегистрированный пользователь,
выбор типа доступа к какому-то элементу, включенные/выключенные уведомления.
 */
public class StrategyMain {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.useProgram();

        computer.setProgram(new Browser());
        computer.useProgram();
        computer.closeProgram();

        computer.setProgram(new ComputerGame());
        computer.useProgram();
    }
}
