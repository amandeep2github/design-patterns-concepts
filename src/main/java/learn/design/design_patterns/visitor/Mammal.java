package learn.design.design_patterns.visitor;

import learn.design.design_patterns.visitor.TalkVisitor;
import learn.design.design_patterns.visitor.WalkVisitor;

public interface Mammal {
    void accept(TalkVisitor talkVisitor);

    void accept(WalkVisitor walkVisitor);
}
