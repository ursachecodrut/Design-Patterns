package Behavioural.Visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println("processing and JSON element with uuid " + jsonElement.uuid);
    }

    @Override
    public void visit(XmlElement xmlElement) {
        System.out.println("processing and XML element with uuid " + xmlElement.uuid);
    }

}
