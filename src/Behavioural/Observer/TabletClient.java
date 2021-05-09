package Behavioural.Observer;

import java.text.MessageFormat;

public class TabletClient extends Observer{
    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(MessageFormat.format("{0} - sent from tablet", message));
    }
    @Override
    void update() {
        System.out.println(MessageFormat.format("Tablet Stream : {0}", subject.getState()));
    }
}
