import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanceServesTest {

    @Test

    public void testFirst() {
        FreelanceServes service = new FreelanceServes();

        int result1 = service.calculateMonthsOfRest( 10000, 3000, 20000);

        //System.out.println(vocation);

        Assertions.assertEquals(3, result1);
    }

    @Test

    public void testSecond() {
        FreelanceServes service = new FreelanceServes();

        int result2 = service.calculateMonthsOfRest( 100000, 60000, 150000);

        //System.out.println(vocation);

        Assertions.assertEquals(2, result2);
    }

    @Test

    public void testThird() {
        FreelanceServes service = new FreelanceServes();

        int result3 = service.calculateMonthsOfRest( 5000, 6000, 10000);

        //System.out.println(vocation);

        Assertions.assertEquals(0, result3);
    }
}
