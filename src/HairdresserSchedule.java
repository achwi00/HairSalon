import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

//individual schedule for each hairdresser
public class HairdresserSchedule
{
    private Hairdresser hairdresser;
    private LocalDate date; //day of the week would be okay so it repeats every week
    //maybe think about automatically filling the work day (attributes: startTime stopTime and it feels it up with
    //visits eg. from 8 till 4pm every half hour
    GeneralSchedule generalSchedule;
    private ArrayList<Visit> visits;

    public HairdresserSchedule(Hairdresser hairdresser, LocalDate date, GeneralSchedule generalSchedule)
    {
        this.hairdresser = hairdresser;
        this.date = date;
        this.generalSchedule = generalSchedule;
        generalSchedule.addSchedule(this); // adding the personal schedule to the general one
        visits = new ArrayList<>();
    }

    public void addVisit(LocalTime startTime, LocalTime stopTime)
    {
        Visit visit = new Visit(getDate(),startTime, stopTime, getHairdresser());
        visits.add(visit);
    }

    public ArrayList<Visit> searchForVisit(LocalDate date)
    {
        ArrayList<Visit> availableVisits = new ArrayList<>();
        for(Visit v : visits)//search in all the visits
        {
            if(v.getStatus().equals("FREE")) availableVisits.add(v); //add the free visit to available ones
        }
        for(Visit v : availableVisits)
        {
            System.out.println(v.toString());
        }
        return availableVisits;//return the list of available visits
    }

    public Hairdresser getHairdresser()
    {
        return hairdresser;
    }

    public void setHairdresser(Hairdresser hairdresser)
    {
        this.hairdresser = hairdresser;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }
}
