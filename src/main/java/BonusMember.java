import java.time.LocalDate;

public class BonusMember
{
    private int memberNumber;

    public LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailAddress;
    private String password;
    Membership membership;
    final int silverLimit = 25000;
    final int goldLimit = 75000;

    public BonusMember(String name, String password, String eMailAddress, Membership membership, int memberNumber, LocalDate enrolledDate, int bonusPointsBalance)
    {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.password = password;
        this.membership = membership;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }

    public String getName() {
        return name;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public Membership getMembership() {
        return membership;
    }
}
