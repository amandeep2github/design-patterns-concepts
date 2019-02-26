package learn.design.design_patterns.visitor;

public class WalkVisitorImpl implements WalkVisitor{
    public void visit(Human human) {
        System.out.println("Dog Talking");
    }

    public void visit(Cat cat) {
        System.out.println("Dog Talking");
    }

    public void visit(Dog dog) {
        System.out.println("Dog Talking");
    }
}
