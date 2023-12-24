import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hairdresser
{
    private int hairdresserId;
    private String specialization; //like colouring or sth
    private String name;
    private ArrayList<RecurringSchedule> schedules;

    public Hairdresser(int hairdresserId, String specialization, String name)
    {
        this.hairdresserId = hairdresserId;
        this.specialization = specialization;
        this.name = name;
        schedules = new ArrayList<>(7); //for each day of the week
    }
    //we need a method for modyfying the schedule

    public void addSchedule(DayOfWeek day, LocalTime start, LocalTime stop, int visitLength)
    {
        RecurringSchedule recurringSchedule = new RecurringSchedule(day, start, stop, visitLength);
        boolean scheduleExists = false;
        for(RecurringSchedule schedule : schedules)
        {
//            DayOfWeek dayOfWeek = schedule.getDayOfWeek();
//            System.out.println(dayOfWeek);
//            if(dayOfWeek.equals(day))
//            {
//                System.out.println("Operation not allowed, schedule for " + day + " already exists");
//                break;
//            }
//            else {
//                schedules.add(recurringSchedule);
//                break;
//            }
            if(schedule.getDayOfWeek().equals(day))
            {
                scheduleExists = true;
                System.out.println("schedule exists already");
                break;
            }
        }
        if(!scheduleExists)
        {
            schedules.add(recurringSchedule);
        }


    }
    public void printSchedules()
    {
        for (RecurringSchedule schedule : schedules)
        {
            System.out.println(schedule.toString());
        }
    }
    public void clearSchedule()
    {
        schedules.clear();
    }

    public RecurringSchedule searchForSchedule(DayOfWeek day)
    {
        RecurringSchedule sch = null;
        for(RecurringSchedule schedule : schedules)
        {
            System.out.println(schedule.toString());
            //if a schedule exists, return it
            if(schedule.getDayOfWeek().equals(day))
            {
                System.out.println("day from searchForSchedule " + schedule.getDayOfWeek());
                sch = schedule;
            }

        }
        return sch;
    }
    public int getHairdresserId()
    {
        return hairdresserId;
    }

    public void setHairdresserId(int hairdresserId)
    {
        this.hairdresserId = hairdresserId;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
