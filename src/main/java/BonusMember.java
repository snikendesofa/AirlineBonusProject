import java.time.LocalDate;

public class BonusMember
{
    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailAddress;
    private String password;
    Membership membership;
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    public BonusMember(String name, String eMailAddress, int memberNumber, LocalDate enrolledDate, int bonusPoints)
    {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.bonusPointsBalance = bonusPoints;
        checkAndSetMemberShip();
    }

    public void checkAndSetMemberShip()
    {
        if(bonusPointsBalance >= GOLD_LIMIT)
        {
            membership = new GoldMemberShip();
        } else if (bonusPointsBalance >= SILVER_LIMIT)
        {
            membership = new SilverMemberShip();
        } else
            { membership = new BasicMemberShip();}

    }

    public String checkMemberShip()
    {
        BasicMemberShip b1 = new BasicMemberShip();
        SilverMemberShip s1 = new SilverMemberShip();
        GoldMemberShip g1 = new GoldMemberShip();

        if(bonusPointsBalance >= GOLD_LIMIT)
        {
            return g1.getMemberShipName();
        } else if (bonusPointsBalance >= SILVER_LIMIT)
        {
            return s1.getMemberShipName();
        } else
        { return b1.getMemberShipName();}

    }

    public void setBonusPointsBalance(int bonusPointsBalance) {
        this.bonusPointsBalance = bonusPointsBalance;
    }

    public void registerBonusPoints(int bonusPoints)
    {
        BasicMemberShip b1 = new BasicMemberShip();
        SilverMemberShip s1 = new SilverMemberShip();
        GoldMemberShip g1 = new GoldMemberShip();

        if(getBonusPointsBalance() < 25000)
        {
            setBonusPointsBalance(b1.registerBalance(getBonusPointsBalance(),bonusPoints));
        }
        else if (getBonusPointsBalance() > 25000 && getBonusPointsBalance() < 75000)
        {
            setBonusPointsBalance(s1.registerBalance(getBonusPointsBalance(),bonusPoints));
        }
        else
            {
                setBonusPointsBalance(g1.registerBalance(getBonusPointsBalance(),bonusPoints));
            }
        checkAndSetMemberShip();
    }

    public boolean checkPassword(String password, String passwordToCheck)
    {
        if(getPassword().equals(passwordToCheck))
        {
            return true;
        } else{return false;}
    }

    public void getInfo()
    {
        System.out.println("#############################");
        System.out.println("Name: " + getName() + "\n" + "email: " + geteMailAddress());
        System.out.println("Member number: " + getMemberNumber() + "\n" + "Bonus points: " + getBonusPointsBalance());
        if(getBonusPointsBalance() < 25000)
        {
            System.out.println("Membership: Basic");
        }
        if(getBonusPointsBalance() > 25000 && getBonusPointsBalance() < 75000)
        {
            System.out.println("Membership: Silver");
        }
        if (getBonusPointsBalance() > 75000)
            {
                System.out.println("Membership: Gold");
            }
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
