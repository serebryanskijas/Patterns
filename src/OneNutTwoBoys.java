import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OneNutTwoBoys {
    public static void main(String[] args) {
        TallBoy tallBoy = new TallBoy();
        Boy boy1 = new LittleBoy(tallBoy);
        Boy boy2 = new LittleBoy(tallBoy);
        tallBoy.addBoy(boy1);
        tallBoy.addBoy(boy2);
        boy1.request(1);
        tallBoy.response();

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
        int countOfBoys = boys.size();
        int count = total / countOfBoys;
        int remainder = total % countOfBoys;
        for (Boy currBoy : boys) {
            //don't tell ourselves
            currBoy.receive(count);
        }
        System.out.println("Mediator: Total count of nuts is " + total + ". " + remainder + " nuts is (are) mine.");
    }


    @Override
    public void setTotal(int total) {
        this.total = total;
    }
}

class LittleBoy extends Boy {

    public LittleBoy(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(int count) {
        System.out.println("Boy: I got " + count + " nuts. ");

    }

    @Override
    public void request(int count) {
        mediator.setTotal(count);

    }
}