import java.time.LocalDate;

public class Membership extends BonusMember
{
    public Membership(String name, String password, String eMailAddress, Membership membership, int memberNumber, LocalDate enrolledDate, int bonusPointsBalance)
    {
        super(name, password, eMailAddress, membership, memberNumber, enrolledDate, bonusPointsBalance);
    }

    /**
     *
     * @param bonusPointsBalance is the current bonus points balance of the user.
     * @param newPoints is the new points that will be added to the current balance.
     * @return ends the method.
     */
    public int registerBalance(int bonusPointsBalance, int newPoints)
    {
        MemberArchiveClient m1 = new MemberArchiveClient();
        newPoints = m1.newPointsInput();
        bonusPointsBalance = super.getBonusPointsBalance() + newPoints;
        return bonusPointsBalance;
    }
}
