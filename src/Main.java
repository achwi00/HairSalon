import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        LocalDate date;
        date = LocalDate.of(2023, 12,25);
//        System.out.println(date);
//
//        LocalTime time = LocalTime.of(12,0);
//        System.out.println(time);

        DayOfWeek monday = DayOfWeek.MONDAY; //? this way xd?
        DayOfWeek tuesday = DayOfWeek.TUESDAY;

        Hairdresser stylistKate = new Hairdresser(1, "stylist", "Kate");
        Hairdresser colourSpecialistJohn = new Hairdresser(2, "colour","John");
        Hairdresser colourSpecialistJenny = new Hairdresser(3, "colour", "Jenny");

        //general monday schedule for all specialists:
        GeneralSchedule monday25Schedule = new GeneralSchedule(date);

        //adding a recurring schedule for monday

        stylistKate.addSchedule(monday, LocalTime.of(8,0),LocalTime.of(16,0),30);
        //colourSpecialistJohn.addSchedule(tuesday, LocalTime.of(12,0),LocalTime.of(14,0),30);
        //colourSpecialistJenny.addSchedule(monday,LocalTime.of(9,0),LocalTime.of(17,0),60);

        HairdresserSchedule kateMon25 = new HairdresserSchedule(stylistKate,date,monday25Schedule);

//        System.out.println("Kate schedules: ");
//        stylistKate.printSchedules();
//        System.out.println("-----------------");

        System.out.println("date from main: " + date.getDayOfWeek());
        kateMon25.followRecurringSchedule();




        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("All visits for: " + date);
        ArrayList<Visit> mondayVisitsAll =  monday25Schedule.searchForVisitByDay(date);
        mondayVisitsAll.forEach(System.out::println);
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println();
        System.out.println(" ------------------------------------------------------------- ");
//        System.out.println("All visits for colour on " + date);
//        ArrayList<Visit> mondayVisitsColour = monday25Schedule.searchForVisitByDayAndSpecialisation("colour",date);
//        System.out.println(" ------------------------------------------------------------- ");

    }
}