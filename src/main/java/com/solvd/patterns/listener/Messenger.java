package com.solvd.patterns.listener;

import java.util.*;

public class Messenger {

    private static final Map<Channel, List<User>> subscribers = new HashMap<>();

    public Messenger() {
        Arrays.stream(Channel.values())
                .forEach(channel -> subscribers.put(channel, new ArrayList<>()));
    }

    public void subscribe(Channel channel, User user) {
        List<User> users = subscribers.get(channel);
        users.add(user);
    }

    public void unsubscribe(Channel channel, User user) {
        List<User> users = subscribers.get(channel);
        users.remove(user);
    }

    public void notify(Channel channel, String message) {
        List<User> users = subscribers.get(channel);
        users.stream()
                .forEach(user -> user.newMessage(message));
    }
}
