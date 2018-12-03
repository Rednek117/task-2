package task2;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class DateGenerator {

    static LocalDate dateGem(){
        long minDay = LocalDate.of(2000, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2030, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
