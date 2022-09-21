public class Main {
    public static void main(String[] args) {
        Magic harryPotter = new Magic();
        harryPotter.setHealth(80);
        harryPotter.setDamage(30);

        Medic malysheva = new Medic();
        malysheva.setHealth(100);
        malysheva.setDamage(40);

        Warrior aragorn = new Warrior();
        aragorn.setHealth(120);
        aragorn.setDamage(50);

        HavingSuperAbility heroes []={harryPotter, malysheva, aragorn};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
            heroes[i].applySuperAbility();
        }
    }
}