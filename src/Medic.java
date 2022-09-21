import java.util.Random;

public class Medic extends Hero{

    Random hPPoints = new Random();
    double healPoints= hPPoints.nextInt(5,10);

    public double increaseExperience(){
        System.out.println(healPoints);
        healPoints*=1.1;
        return healPoints;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Heath "+getHealth()+", Damage "+getDamage()+", ⚕️ Medic gave everyone RED-BULL");

    }


}
