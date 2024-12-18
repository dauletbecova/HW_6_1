public class Skeleton extends Boss {
    private int arrows;

    public Skeleton(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        System.out.println("Скелет: Здоровье: " + getHealth() + ", Урон: " + getDamage() +
                ", Оружие: " + getWeapon().getName() + " (" + getWeapon().getType() +
                "), Стрел: " + arrows);
    }
}
