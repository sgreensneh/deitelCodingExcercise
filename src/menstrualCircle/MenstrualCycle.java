package menstrualCircle;

import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualCycle {
    private LocalDate startDate;
    private int cycleLength;

    public MenstrualCycle(LocalDate startDate, int cycleLength) {
        this.startDate = startDate;
        this.cycleLength = cycleLength;
    }

    public LocalDate getStartDate() {
        return startDate;
    }



    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(int cycleLength) {
        this.cycleLength = cycleLength;
    }

    public LocalDate getCurrentCycleEndDate() {
        return startDate.plusDays(cycleLength - 1);
    }

    public LocalDate getNextCycleStartDate() {
        return getCurrentCycleEndDate().plusDays(1);
    }

}


