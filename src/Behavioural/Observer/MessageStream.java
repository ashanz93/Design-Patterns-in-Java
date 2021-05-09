package Behavioural.Observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

    private Deque<String> messagehistory = new ArrayDeque<String>();

    @Override
    void setState(String message) {
        messagehistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messagehistory.getLast();
    }
}
