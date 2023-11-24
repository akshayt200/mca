

import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MyObservable) {
            MyObservable observable = (MyObservable) o;
            int value = (int) arg;
            System.out.println("Received update. New value: " + value);
        }
    }
}

public class Q22_ObservableObserverExample {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);

        observable.setValue(10); // This will trigger an update to the observer
        observable.setValue(20); // This will trigger another update to the observer
    }
}
