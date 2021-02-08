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
        return bonusPointsBalance + newPoints;
    }
}
