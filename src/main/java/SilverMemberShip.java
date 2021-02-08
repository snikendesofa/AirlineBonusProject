import static java.lang.Math.round;

public class SilverMemberShip extends Membership
{

    @Override
    public String getMemberShipName()
    {
        return "Silver";
    }

    @Override
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        double bonusBoost = 1.2;
        return bonusPointsBalance + newPoints * (int) (bonusBoost);
    }
}
