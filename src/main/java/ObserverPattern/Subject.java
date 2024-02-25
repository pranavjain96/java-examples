package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void setState(int state) {
        this.state=state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    public int getState() {
        return this.state;
    }
}
