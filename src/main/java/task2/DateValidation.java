package task2;

import java.time.DateTimeException;
import java.time.LocalDate;


public class DateValidation {

    private static LocalDate currentDate = LocalDate.now();

    public static boolean validateFromToDates(LocalDate fromDate, LocalDate toDate) throws DateTimeException  {
        try {
            if (fromDate.isBefore(toDate)) {
                if (fromDate.isBefore(currentDate) && !toDate.isAfter(currentDate)) {
                    return true;
                }
                if (fromDate.isAfter(currentDate) && toDate.isAfter(currentDate) && !fromDate.isEqual(currentDate) && !toDate.isEqual(currentDate)) {
                    return true;
                }
                if (fromDate.isBefore(currentDate) && !toDate.isBefore(currentDate)) {
                    return true;
                }
            }
        }catch (DateTimeException ex){
            throw new DateTimeException("Invalid date");
        }
        return false;
    }
}
