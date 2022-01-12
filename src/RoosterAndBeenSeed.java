//Шаблон "Цепочка ответственности (обязанностей)
public class RoosterAndBeenSeed {
    public static void main(String[] args) {
        Helper hen = new Hen();
        Helper cow = new Cow();
        Helper mowers = new Mower();
        Helper oven = new Oven();
        hen.setNextHelper(cow);
        cow.setNextHelper(mowers);
        mowers.setNextHelper(oven);
        hen.help();

    }

}

abstract class Helper {

    private Helper nextHelper;

    abstract void sendMessage();

    public void help() {
        sendMessage();
        if (nextHelper != null) {
            nextHelper.help();
        }
    }

    public void setNextHelper(Helper nextHelper) {
        this.nextHelper = nextHelper;
    }
}

class Hen extends Helper {

    @Override
    void sendMessage() {
        System.out.println("Курица - корове: дай маслица.");
    }
}

class Cow extends Helper {

    @Override
    void sendMessage() {
        System.out.println("Корова - косарям: дайте сена.");
    }
}

class Mower extends Helper {

    @Override
    void sendMessage() {
        System.out.println("Косари - печке: дай калачей.");
    }
}

class Oven extends Helper {

    @Override
    void sendMessage() {
        System.out.println("Печка - дровосеку: дай дров.");
    }
}