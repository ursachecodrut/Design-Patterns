package Behavioural.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
    List<Element> elements = new ArrayList<>();

    @Override
    public void accept(Visitor v) {
        for(Element element : elements) {
            element.accept(v);
        }
    }
}
