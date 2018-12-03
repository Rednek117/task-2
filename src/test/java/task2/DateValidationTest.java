package task2;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateValidationTest {
    private LocalDate fromDate = DateGenerator.dateGem();
    private LocalDate toDate = DateGenerator.dateGem();



    @Test
    public void validateFromToDates() {
        assertTrue(DateValidation.validateFromToDates(fromDate, toDate));
    }
}