package learn.design.design_patterns.visitor;

public class Cat implements Mammal {
    public void accept(TalkVisitor talkVisitor){
        talkVisitor.visit(this);
    }

    public void accept(WalkVisitor walkVisitor){
        walkVisitor.visit(this);
    }
}
