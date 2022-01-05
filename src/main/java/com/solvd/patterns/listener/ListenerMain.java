package com.solvd.patterns.listener;

/*
Этот паттерн можно использовать во многих приложениях, где используются
push-уведомления, которые можно отключить, а также рассылках или для
напоминаний в календарях
 */
public class ListenerMain {

    public static void main(String[] args) {

        Messenger messenger = new Messenger();

        User firstUser = new User("firstUser");
        User secondUser = new User("secondUser");

        messenger.subscribe(Channel.NEWS, firstUser);
        messenger.subscribe(Channel.GAMES, firstUser);

        messenger.subscribe(Channel.NEWS, secondUser);
        messenger.subscribe(Channel.FILMS, secondUser);

        messenger.notify(Channel.NEWS, "Today's news");
        messenger.notify(Channel.FILMS, "Top films this year");

        messenger.unsubscribe(Channel.NEWS, firstUser);
        messenger.notify(Channel.NEWS, "Week recap");
    }
}
