package sem2;

public class Fish extends Herbivores implements Swimable{
    public Fish(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfSwim() {
        return 30;
    }
    public String toString(){
        return "I'm fish. " + super.toString() + ". My speed is " + speedOfSwim() ;
    }
    @Override
    public String say() {
        return "Bul-Bul";
    }
}

