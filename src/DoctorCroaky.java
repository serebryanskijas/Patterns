public class DoctorCroaky {

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

class Fox implements Animal{

    @Override
    public void come() {
        System.out.println("The fox came!");
    }
    public void ask(){
        System.out.println("Fox: If you can cure everyone then why haven't you cured your lame legs?");
    }
    public void answer(){
        System.out.println("Fox: Yes, we can be friends.");
    }
}

class Turtle implements Animal{

    @Override
    public void come() {
        System.out.println("The turtle came!");
    }
}

class Rabbit implements Animal{

    @Override
    public void come() {
        System.out.println("The rabbit came!");
    }
}