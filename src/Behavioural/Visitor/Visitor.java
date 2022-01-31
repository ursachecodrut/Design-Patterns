package Behavioural.Visitor;


public interface Visitor {

    public void visit(JsonElement jsonElement);

    public void visit(XmlElement xmlElement);

}
