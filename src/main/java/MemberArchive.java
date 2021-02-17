import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The member archive holds all the bonus members. The archive provides
 * functionality for adding members to the register, looking up bonuspoints
 * of given members, registering new bonuspoints and listing all the members.
 *
 * @author arne
 */
public class MemberArchive {

    // Use a HashMap, since the members have a unique member number.
    private HashMap<Integer, BonusMember> members;

    /**
     * Creates a new instance of MemberArchive.
     */
    public MemberArchive()
    {
        this.members = new HashMap<>();
        this.fillRegisterWithTestdata();
    }

    /**
     * Adds a new member to the register. The new member must have a memebr number
     * different from exsisting members. If not, the new member will not be added.
     *
     * @return {@code true} if the new member was added successfully,
     *         {@code false} if the new member could not be added, due to a
     *          membernumber that allready exsists.
     */
    public boolean addMember(BonusMember bonusMember) {
        boolean success = false;
        //TODO: Fill in your solution
        return success;
    }

    /**
     * Registers new bonuspoints to the member with the member number given
     * by the parameter {@code memberNumber}. If no member in the register
     * matches the provided member number, {@code false} is returned.
     *
     * @param memberNumber the member number to add the bonus points to
     * @param bonusPoints the bonus points to be added
     * @return {@code true} if bonuspoints were added successfully,
     *         {@code flase} if not.
     */
    public boolean registerPoints(int memberNumber,int bonusPoints)
    {
        boolean success = false;

        BonusMember member = findMember(memberNumber);
        if(member != null)
        {
            member.registerBonusPoints(bonusPoints);
            success = true;
        }

        return success;
    }

    public BonusMember findMember(int memberNumber)
    {
        try
        {
            return this.members.get(memberNumber);
        } catch (Exception e)
        {
            return null;
        }
    }


    /**
     * Lists all members to the console.
     */
    public void listAllMembers()
    {
        for (Map.Entry<Integer, BonusMember> entry : members.entrySet())
        {
            int key = entry.getKey();
            BonusMember values = entry.getValue();
            values.getInfo();
        }
    }


    /**
     * Fills the register with some arbitrary members, for testing purposes.
     */
    private void fillRegisterWithTestdata()
    {
        BonusMember member1 = new BonusMember("Håkon Fossum", "haakon@hotmail.com", 111112, LocalDate.now(), 0);
        this.members.put(member1.getMemberNumber(), member1);

        BonusMember member2 = new BonusMember("Theodor Fossum", "theodor@hotmail.com", 111113, LocalDate.now(), 30000);
        this.members.put(member2.getMemberNumber(), member2);

        BonusMember member3 = new BonusMember("Runar Fossum", "runar@hotmail.com", 111114, LocalDate.now(), 96000);
        this.members.put(member3.getMemberNumber(), member3);

    }


}