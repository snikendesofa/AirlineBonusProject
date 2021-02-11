public class GoldMemberShip extends Membership
{

    final float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    final float POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;

    @Override
    public String getMemberShipName()
    {
        return "Gold";
    }

    @Override
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        float newFloatPoints = (float) newPoints;

        if(bonusPointsBalance < 90000)
        {
            return bonusPointsBalance + Math.round(newFloatPoints*POINTS_SCALING_FACTOR_LEVEL_1);
        } else
            {
                return bonusPointsBalance + Math.round(newFloatPoints*POINTS_SCALING_FACTOR_LEVEL_2);
            }
    }
}
