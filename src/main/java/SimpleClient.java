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
       archive1.registerPoints(111112, 96000);
       client1.spaces();
       archive1.infoOnMember(111112);
       client1.spaces();
       System.out.println(archive1.findPoints(111112));
       BonusMember b7 = new BonusMember("Kiran", "kirankjekk@kul.com", 111115, LocalDate.now(), 0);
       archive1.addMember(b7);
       archive1.infoOnMember(111115);
    }

    public void spaces()
    {
        System.out.println();
        System.out.println("################################");
        System.out.println();
    }

}
