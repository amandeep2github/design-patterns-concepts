package learn.design.design_patterns.visitor;

public class TalkVisitorImpl implements TalkVisitor{
    public void visit(Human human) {
        System.out.println("Human Walking");
    }

    public void visit(Cat cat) {
        System.out.println("Mammal Walking");
    }

    public void visit(Dog dog) {
        System.out.println("Dog Walking");
    }
}
