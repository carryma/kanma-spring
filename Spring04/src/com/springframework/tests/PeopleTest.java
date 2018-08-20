import com.springframework.entity.People;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac=new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void test() {
        People people=(People)ac.getBean("people");
        people.setId(1);
        System.out.println(people);
    }
}