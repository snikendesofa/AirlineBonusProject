import static java.lang.Math.round;

public class SilverMemberShip extends Membership
{

    final float POINTS_SCALING_FACTOR = 1.2f;

    @Override
    public String getMemberShipName()
    {
        return "Silver";
    }

    @Override
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        float newPointsFloat = (float) newPoints;

        return bonusPointsBalance + Math.round(newPointsFloat*POINTS_SCALING_FACTOR);

    }
}
