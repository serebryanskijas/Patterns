import java.util.ArrayList;

public class DoctorCroaky {
    public static void main(String[] args) {
        /*Story story = new Story();
        story.tellFirstStory();*/

        Story2 story2 = new Story2();
        story2.tellSecondStory();
    }

}

class Frog {
    public Frog went() {
        System.out.println("The frog went to the forest lake");
        return this;
    }

    public Frog sayHello() { //chaining
        System.out.println("Frog: Friends, please come here. I am new here. I want to meet all of you. I have come from the village.");
        return this;
    }

    public Frog introduce() {
        System.out.println("Frog: Let me introduce myself. I am Dr. Croaky");
        return this;
    }

    public Frog advertise() {
        System.out.println("Frog: I have medicines for all animals’ diseases. You can come to meet me anytime.");
        return this;
    }

    public Frog askToBeFriend() {
        System.out.println("Frog: Can we be friends?");
        return this;
    }

    public Frog listen() {
        System.out.println("The frog went red with shame for his lie had been detected.");
        return this;
    }
}

interface Animal {
    public void come();
}

class Fox implements Animal {

    @Override
    public void come() {
        System.out.println("The fox came!");
    }

    public void ask() {
        System.out.println("Fox: If you can cure everyone then why haven't you cured your lame legs?");
    }

    public void answer() {
        System.out.println("Fox: Yes, we can be friends.");
    }
}

class Turtle implements Animal {

    @Override
    public void come() {
        System.out.println("The turtle came!");
    }
}

class Rabbit implements Animal {

    @Override
    public void come() {
        System.out.println("The rabbit came!");
    }
}

class Story {
    private final ArrayList<Animal> animals = new ArrayList<>();

    public void tellFirstStory() {
        Frog frog = new Frog();
        animals.add(new Rabbit());
        animals.add(new Turtle());
        Animal fox = new Fox();
        animals.add(fox);
        frog.went().sayHello();
        animals.forEach(Animal::come);
        frog.introduce().advertise();
        ((Fox)fox).ask();
        frog.listen();
    }
}

class Story2 {
    private final ArrayList<Animal> animals = new ArrayList<>();

    public void tellSecondStory() {
        Frog frog = new Frog();
        animals.add(new Rabbit());
        animals.add(new Turtle());
        Animal fox = new Fox();
        animals.add(fox);
        frog.went().sayHello();
        animals.forEach(Animal::come);
        frog.introduce().askToBeFriend();
        ((Fox)fox).answer();

    }
}