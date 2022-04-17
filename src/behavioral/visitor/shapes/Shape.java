package behavioral.visitor.shapes;

import behavioral.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);

}
