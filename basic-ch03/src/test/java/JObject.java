import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by gbagony on 2017/2/17.
 */
public class JObject {

    @Test
    public void test() {
        Integer obj = (Integer) new Object();
    }

    @Test
    public void testBasicOperand() {
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void testMission() {
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

    @Test
    public void testQuote() {
        Set<User> users = new HashSet<>();
        User user1 = new User("Jack", 23, "HZ");
        User user2 = new User("Bob", 24, "AQ");
        users.add(user1);
        users.add(user2);
        User user3 = users.stream().filter(user -> user instanceof User && user.getName() == "Bob").collect(Collectors.toList()).get(0);
        user3.setAddress("BJ");
        users.add(user3);
        User user4 = users.stream().filter(user -> user instanceof User && user.getName() == "Bob").collect(Collectors.toList()).get(0);
        System.out.println(users.size());
        System.out.println(user4);

    }

    @Test
    public void testBook() {
        Book book = new Book("Book", null);
        System.out.println(book.getPublishDate());
        System.out.println(book);

        System.out.println(book.getClass().getSimpleName());
        System.out.println(Book.class.getSimpleName());
        System.out.println(book.getClass().getSimpleName() == "Book");
    }

    @Test
    public void testDate() throws InterruptedException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = df.format(new Date());
        Thread.sleep(1000L);
        String lastDate = df.format(new Date());

        System.out.println(nowDate);
        System.out.println(lastDate);
    }


}
