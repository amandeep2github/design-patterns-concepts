package learn.design.design_patterns.visitor;

public class Dog implements Mammal{
    public void accept(TalkVisitor talkVisitor){
        talkVisitor.visit(this);
    }

    public void accept(WalkVisitor walkVisitor){
        walkVisitor.visit(this);
    }
}
