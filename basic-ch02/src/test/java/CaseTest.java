import org.junit.Test;

/**
 * Created by gbagony on 2017/2/16.
 */
public class CaseTest {

    @Test
    public void testUser(){
        User user1 = new User("A");
        User user2 = new User("A");

        assert user1 == user2;
    }

    @Test
    public void testCity(){
        System.out.println(Integer.parseInt(null));
    }
}
