package Behavioural.Observer;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

public class UtilObserverDemo {
    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();
        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");

        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);

        twitterStream.someoneTweeted();
    }


}

// concrete subject
class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

// concrete observer
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(MessageFormat.format("Update {0}'s stream, someone tweeted something", name));
    }
}
