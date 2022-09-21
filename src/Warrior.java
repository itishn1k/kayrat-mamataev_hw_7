public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Heath "+getHealth()+", Damage "+getDamage()+", ⚔️ Warrior applied CRITICAL-DAMAGE");
    }
}
