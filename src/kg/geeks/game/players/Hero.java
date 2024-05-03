package kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(String lechenie, int damage, int health, Object name) {
        super(health, damage, lechenie, name);
        this.ability = ability;
    }

    public Hero() {
        super();
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
}
