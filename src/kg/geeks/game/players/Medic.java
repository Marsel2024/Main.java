package kg.geeks.game.players;

import javax.xml.namespace.QName;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints, String name) {
        super(name, damage, health, name);
        this.healPoints = healPoints;
    }

    public Medic(double health, int damage, int healPoints, String ahiles) {
        super(ahiles, damage, (int) health, new Medic());
    }

    public Medic() {
        super();
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && hero != this) {
                hero.setHealth(hero.getHealth() + this.healPoints);

            }
        }
    }
}
/*
public abstract class Medic extends Hero {
    private int lechenieHero;
    public Medic(int health, int damage, int lechenie, String name) {
        super(health, damage, SuperAbility.HEAL, name);
    }

    @Override
    public int getHealth(Hero ) {
    }
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }
}
*/
