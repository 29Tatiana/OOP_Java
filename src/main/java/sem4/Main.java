package sem4;

public class Main {
    public static void main(String[] args) {

        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman(55, "Carl", new Melee("spear", 15)));
        squadF.add(new Footman(55, "Jon", new Melee("sword", 10)));
        squadF.add(new Footman(55, "Alex", new Melee("axe", 20)));

        for (Footman item : squadF) {
            System.out.println(item);
        }
        System.out.println(squadF.getTeamHealth());
        System.out.println(squadF.getMaxRange());
        System.out.println(squadF.getSumDamage());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Team<BaseHero> squadA = new Team<>();

        squadA.add(new Archer(15, "Jonson", new Ranged("bow", 5, 50)));
        squadA.add(new Archer(15, "Jonathan", new Ranged("crossbow", 15, 25)));
        squadA.add(new Footman(55, "Phillip", new Melee("sword", 10)));
        squadA.add(new Footman(55, "Poll", new Melee("axe", 20)));

       for (BaseHero item : squadA) {
            System.out.println(item);
        }
        System.out.println(squadA.getTeamHealth());
        System.out.println(squadA.getMaxRange());
        System.out.println(squadA.getSumDamage());
        Footman footman1 = new Footman(77 , "mark" , new Melee("book"  , 30));
        Footman footman2 = new Footman(66 , "adam" , new Melee("weights"  , 45));
        while (footman1.getHealth()>0 && footman2.getHealth()> 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("~~~~~~~~");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("____________");
        }
        if (footman1.getHealth()>0){
            System.out.println(footman1 + " is Winner");
        }
        else {
            System.out.println(footman2 + " is Winner");
        }

        Team<BaseHero> squadS = new Team<>();

        squadS.add(new Archer(15, "jonh", new Ranged("bow", 5, 50)));
        squadS.add(new Archer(15, "jonathan", new Ranged("crossbow", 15, 25),new Manlet("Aegis" , 30, false)));
        squadS.add(new Footman(55, "carl", new Melee("sword", 10), new HandShield("Piter" , 20, true)));
        squadS.add(new Footman(55, "Nick", new Melee("axe", 20)));

        for (BaseHero item : squadS) {
            System.out.println(item);
        }
        System.out.println(squadS.minArmorToString(squadS.minArmor()));
    }
}