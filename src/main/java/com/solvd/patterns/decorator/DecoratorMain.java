package com.solvd.patterns.decorator;

/*
Данный паттерн можно использовать, например если зарегистрированным пользователям предоставляется
расширенный функционал или при добавлении дополнительых функций в новых версиях
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.readNews();
        messenger.readMessage();
        messenger.sendMessage();
    }
}
