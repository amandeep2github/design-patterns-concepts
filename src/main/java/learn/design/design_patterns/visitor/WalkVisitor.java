package learn.design.design_patterns.visitor;

public interface WalkVisitor {
    void visit(Human human);
    void visit(Cat cat);
    void visit(Dog dog);
}
