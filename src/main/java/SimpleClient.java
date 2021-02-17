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
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
       archive1.registerPoints(111112, 96000);
       archive1.listAllMembers();

    }

}
