import java.time.DayOfWeek;
import java.time.LocalTime;

public class RecurringSchedule
{
    private DayOfWeek dayOfWeek;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;
    private int visitTimeMinutes;
    private Hairdresser hairdresser;

    public RecurringSchedule(DayOfWeek dayOfWeek, LocalTime shiftStart, LocalTime shiftEnd, int visitTimeMinutes)
    {
        this.dayOfWeek = dayOfWeek;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.visitTimeMinutes = visitTimeMinutes;
    }

}
