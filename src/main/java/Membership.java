public class Membership
{

    public String getMemberShipName()
    {

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
