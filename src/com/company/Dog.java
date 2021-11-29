package com.company;

public abstract class Dog {
    String tail;
    String ears;
    public Dog() {
        tail = "normal";
        ears = "normal";
    }

    public Dog(String tail, String ears) {
        this.tail = tail;
        this.ears = ears;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "tail is " + tail +
                ", ears are " + ears +
                '}';
    }
}
