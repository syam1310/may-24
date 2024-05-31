package org.practice_24.design.factory.observer;

public interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);

    void newVideoUploaded();

    void newVideoUploaded(String title);
}
