import java.time.LocalDate;
import java.time.LocalTime;

public class Visit
{
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime stopTime; //= startTime + 0,5 h
    private Hairdresser hairdresser;
    private enum Status
    {
        FREE, BOOKED;
    }

    private Status status;
    public Visit(LocalDate date, LocalTime startTime, LocalTime stopTime, Hairdresser hairdresser)
    {
        this.date = date;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.hairdresser = hairdresser;
        this.status = Status.FREE; //by default, the created visit is free
    }

    public void setStatus(String s)
    {
        if(s.equalsIgnoreCase("BOOKED"))
        {
            this.status = Status.BOOKED;
        }
        else if(s.equalsIgnoreCase("FREE"))
        {
            this.status = Status.FREE;
        }
    }
    public String getStatus()
    {
        String stat = null;
        if(this.status.equals(Status.FREE))
        {
            stat="FREE";
        }
        else if(status.equals(Status.BOOKED))
        {
            stat="BOOKED";
        }

        return stat;
    }

    @Override
    public String toString()
    {
        return "Visit{" +
                "date=" + date +
                ", From=" + startTime +
                ", To=" + stopTime +
                ", hairdresser=" + hairdresser.getName() +
                '}';
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getStartTime()
    {
        return startTime;
    }

    public void setStartTime(LocalTime startTime)
    {
        this.startTime = startTime;
    }

    public LocalTime getStopTime()
    {
        return stopTime;
    }

    public void setStopTime(LocalTime stopTime)
    {
        this.stopTime = stopTime;
    }

    public Hairdresser getHairdresser()
    {
        return hairdresser;
    }

    public void setHairdresser(Hairdresser hairdresser)
    {
        this.hairdresser = hairdresser;
    }
}
