package Behavioural.Visitor;

public class JsonElement extends Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
