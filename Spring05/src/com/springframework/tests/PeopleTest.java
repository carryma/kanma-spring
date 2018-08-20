import com.springframework.entity.People;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
    private ApplicationContext ac ;
    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("beans.xml");
    }
    @Test
    public void test()throws Exception{
        People kanma = (People)ac.getBean("kanma");
        People heshan = (People)ac.getBean("heshan");
        System.out.println(kanma);
        System.out.println(heshan);

    }

}