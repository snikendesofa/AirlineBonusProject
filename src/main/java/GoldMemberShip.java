public class GoldMemberShip extends Membership
{

    @Override
    public String getMemberShipName()
    {
        return "Gold";
    }

    @Override
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        return bonusPointsBalance + newPoints;
    }
}
