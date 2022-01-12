import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.getContentPane().setBackground(Color.BLACK);

        Container container = new Container();
        frame.add(container);
        Shape rect1 = new Rect(Color.BLUE, 250, 200);
        Shape rect2 = new Rect(Color.DARK_GRAY, 350, 250);
        Group group1 = new Group(Color.YELLOW, 0, 0);
        group1.add(rect1);
        group1.add(rect2);
        container.add(group1);

        Shape rect3 = new Rect(Color.BLACK, 200, 20);
        Shape rect4 = new Rect(Color.CYAN, 100, 100);
        Group group2 = new Group(Color.BLUE, 0, 0);
        group2.add(rect3);
        group2.add(rect4);
        container.add(group2);

        Group group3 = new Group(Color.RED, 0, 0);
        group3.add(group1);
        group3.add(group2);
        container.add(group3);


        frame.setVisible(true);
    }
}

interface IShape {
    void paint(Graphics graphics);
}

abstract class Shape implements IShape {
    public Color color;
    public int x;
    public int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }


    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(color);
    }

}

class Rect extends Shape {

    public Rect(Color color, int x, int y) {
        super(color, x, y);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x, y, 30, 20);

    }
}

class Container extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        setBackground(Color.GREEN);
        super.paintComponent(graphics);
        shapes.forEach(shape -> {
            shape.paint(graphics);
        });
    }
}

class Group extends Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public Group(Color color, int x, int y) {
        super(color, x, y);

    }

    @Override
    public void paint(Graphics graphics) {
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }

    public void add(Shape shape) {
        shapes.add(shape);
        shape.color = color;
    }
}