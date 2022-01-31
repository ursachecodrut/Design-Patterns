package Behavioural.Visitor;

import java.util.Random;

public abstract class Element {
    public int uuid;

    public Element() {
        uuid = new Random().nextInt(100);
    }

    public abstract void accept(Visitor v);
}
