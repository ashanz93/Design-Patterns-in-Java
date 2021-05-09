package Behavioural.Observer;

import java.text.MessageFormat;

public class PhoneClient extends Observer{

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(MessageFormat.format("{0} - sent from phone", message));
    }
    @Override
    void update() {
        System.out.println(MessageFormat.format("Phone Stream : {0}", subject.getState()));
    }
}
