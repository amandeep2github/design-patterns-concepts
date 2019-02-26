package learn.design.design_patterns.visitor;

public interface TalkVisitor {
    void visit(Human human);
    void visit(Cat cat);
    void visit(Dog dog);
}
