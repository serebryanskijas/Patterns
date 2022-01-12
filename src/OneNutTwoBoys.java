import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OneNutTwoBoys {
    public static void main(String[] args) {

    }
}

interface Mediator {
    void response();

    void setTotal(int total);
}

abstract class Boy {
    public abstract void receive(int count);

    public abstract void request(int count);

    protected Mediator mediator;

    public Boy(Mediator mediator) {
        this.mediator = mediator;
    }
}

class TallBoy implements Mediator {
    private List<Boy> boys = new ArrayList<>();
    private int total = 0;

    public void addBoy(Boy boy) {
    boys.add(boy);
    }

    @Override
    public void response() {

    }

    @Override
    public void setTotal(int total) {
    this.total = total;
    }
}