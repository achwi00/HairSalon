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

    public void addSchedule()
    {

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
