package Behavioural.Visitor;

public class XmlElement extends Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
