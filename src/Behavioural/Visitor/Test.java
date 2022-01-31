package Behavioural.Visitor;

public class Test {

    public static void main(String[] args) {
        Visitor visitor = new ElementVisitor();

        Document document = new Document();
        document.elements.add(new JsonElement());
        document.elements.add(new XmlElement());
        document.elements.add(new JsonElement());

        document.accept(visitor);
    }
}
