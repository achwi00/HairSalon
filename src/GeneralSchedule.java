import java.time.LocalDate;
import java.util.ArrayList;

//general schedule for all hairdresses in the salon, mostly to allow searching and booking for clients
public class GeneralSchedule
{
    LocalDate date;
    ArrayList<HairdresserSchedule> generalSchedule;

    public GeneralSchedule(LocalDate date)
    {
        this.date = date;
        this.generalSchedule = new ArrayList<>();
    }

    public void addSchedule(HairdresserSchedule schedule)
    {
        generalSchedule.add(schedule);
    }
    public ArrayList<Visit> searchForVisitByDay(LocalDate date)
    {
        ArrayList<Visit> availableList = new ArrayList<>();
        for(HairdresserSchedule schedule : generalSchedule)
        {
            availableList.addAll(schedule.searchForVisit(date));
        }
        return availableList;
    }
    public ArrayList<Visit> searchForVisitByDayAndSpecialisation(String specialisation, LocalDate date)
    {
        ArrayList<Visit> availableList = new ArrayList<>();
        for(HairdresserSchedule schedule : generalSchedule)
        {
            if(schedule.getHairdresser().getSpecialization().equals(specialisation))
            {
                availableList.addAll(schedule.searchForVisit(date));
            }
        }
        return availableList;
    }

}
