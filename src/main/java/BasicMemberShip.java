import java.time.LocalDate;

public class BasicMemberShip extends Membership
{
    @Override
    public String getMemberShipName()
    {
        return "Basic";
    }

    @Override
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        return bonusPointsBalance + newPoints;
    }
}
