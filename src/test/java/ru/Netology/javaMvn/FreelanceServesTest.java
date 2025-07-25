package ru.Netology.javaMvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelanceServesTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/dataTest.csv")
    public void testFirst(int income, int expenses, int threshold, int expected) {
        FreelanceServes service = new FreelanceServes();

        int actual = service.calculateMonthsOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
//    @Test
//
//  public void testSecond() {
//   FreelanceServes service = new FreelanceServes();
//
//      int result2 = service.calculateMonthsOfRest( 100000, 60000, 150000);
//
//      //System.out.println(vocation);
//
//      Assertions.assertEquals(2, result2);
// }//

//@Test

//public void testThird() {
//    FreelanceServes service = new FreelanceServes();

//    int result3 = service.calculateMonthsOfRest( 5000, 6000, 10000);

//System.out.println(vocation);

//    Assertions.assertEquals(0, result3);
//}
//}
