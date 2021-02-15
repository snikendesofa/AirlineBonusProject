import sun.java2d.pipe.SpanShapeRenderer;

import java.lang.reflect.Member;
import java.time.LocalDate;

public class SimpleClient
{
    MemberArchive archive1;

    public static void main(String [] args)
    {
       MemberArchive archive1 = new MemberArchive();
       SimpleClient client1 = new SimpleClient();
       archive1.listAllMembers();
       //client1.registerBonusPointsClient(111113, 50000);
        archive1.registerPoints(111113, 50000);
        archive1.listAllMembers();

    }

    public void registerBonusPointsClient(int memberNumber, int bonusPoints)
    {
        if(archive1.registerPoints(memberNumber, bonusPoints))
        {
            archive1.listAllMembers();
        }
    }


}
