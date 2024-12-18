public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.SWORD, "Меч");
        Weapon bow = new Weapon(WeaponType.BOW, "Лук");

      Skeleton skeleton1 = new Skeleton(100, 15, sword, 50);
        Skeleton skeleton2 = new Skeleton(120, 10, bow, 30);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
