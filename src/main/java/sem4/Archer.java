package sem4;

public class Archer extends BaseHero<Ranged , Manlet>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);
    }
    public Archer(int health, String name, Ranged ranged, Manlet shield) {
        super(health, name, ranged, shield);
    }
    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }
    public  int range(){
        return ((Ranged)weapon).getRange();
    }
    @Override
    public String toString() {
        return "Archer{" + super.toString() + "\n" +  "~~~";
    }
}