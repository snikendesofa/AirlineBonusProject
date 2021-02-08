public abstract class Membership
{

    public abstract String getMemberShipName();

    /**
     *
     * @param bonusPointsBalance is the current bonus points balance of the user.
     * @param newPoints is the new points that will be added to the current balance.
     * @return ends the method.
     */
    public abstract int registerBalance(int bonusPointsBalance, int newPoints);


}
