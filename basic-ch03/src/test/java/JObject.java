import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gbagony on 2017/2/17.
 */
public class JObject {

    @Test
    public void test(){
        Integer obj = (Integer) new Object();
    }

    @Test
    public void testBasicOperand(){
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void testMission(){
        Collection<Mission> missions = new ArrayList<>();
        missions.add(new DocumentMission().setState("AC"));
        missions.add(new InviteMission().setState("UNAC"));
        missions.add(new DocumentMission().setState("UNAC"));
        missions.add(new InviteMission().setState("AC"));
        System.out.println(missions);

        Set<Mission> mission = new HashSet<>();
        mission.add(new DocumentMission().setState("AC"));
        mission.add(new InviteMission().setState("UNAC"));
        mission.add(new DocumentMission().setState("UNAC"));
        mission.add(new InviteMission().setState("AC"));
        System.out.println(mission.size());
    }

}
