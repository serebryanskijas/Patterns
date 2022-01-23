public class Calculator { //pattern Strategy

    public static void main(String[] args) {
        Context context = new Context(new AddOperator());
        System.out.println(context.execute(1,2));
        context = new Context(new NegativeOperator());
        System.out.println(context.execute(1));
    }
}

interface Strategy {
    int doOperation(int a);

    int doOperation(int a, int b);
}

class AddOperator implements Strategy {

    @Override
    public int doOperation(int a) {
        return a * 2;
    }

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}

class NegativeOperator implements Strategy {

    @Override
    public int doOperation(int a) {
        return -a;
    }

    @Override
    public int doOperation(int a, int b) {
        return 0;
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a){
        return strategy.doOperation(a);
    }

    public int execute (int a, int b){
        return strategy.doOperation(a,b);
    }
}