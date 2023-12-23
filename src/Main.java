import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String s = "hello";
        System.out.println(s);

        LocalDate date;
        date = LocalDate.of(2023, 7,13);
//        System.out.println(date);
//
//        LocalTime time = LocalTime.of(12,0);
//        System.out.println(time);

        DayOfWeek monday = DayOfWeek.MONDAY; //? this way xd?

        Hairdresser stylist = new Hairdresser(1, "stylist", "Kate");
        Hairdresser colourSpecialist = new Hairdresser(2, "colour","John");
        Hairdresser colourSpecialist2 = new Hairdresser(3, "colour", "Jenny");

        //general monday schedule for all specialists:
        GeneralSchedule mondaySchedule = new GeneralSchedule(date);
        //Kate monday schedule:
        HairdresserSchedule KateMonday = new HairdresserSchedule(stylist, date, mondaySchedule);
        KateMonday.addVisit(LocalTime.of(11,0), LocalTime.of(11,30));
        KateMonday.addVisit(LocalTime.of(12,0), LocalTime.of(12,30));
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("KateMonday.searchForVisit(date: )");
        KateMonday.searchForVisit(date);
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println();
        //John monday shcedule
        HairdresserSchedule JohnMonday = new HairdresserSchedule(colourSpecialist, date, mondaySchedule);
        JohnMonday.addVisit(LocalTime.of(11,0),LocalTime.of(11,30));
        JohnMonday.addVisit(LocalTime.of(12,0),LocalTime.of(12,30));
        JohnMonday.addVisit(LocalTime.of(13,0),LocalTime.of(13,30));

        //Jenny monday schedule
        HairdresserSchedule JennyMonday = new HairdresserSchedule(colourSpecialist2, date, mondaySchedule);
        JennyMonday.addVisit(LocalTime.of(11,0),LocalTime.of(11,30));
        JennyMonday.addVisit(LocalTime.of(12,0),LocalTime.of(12,30));
        JennyMonday.addVisit(LocalTime.of(13,0),LocalTime.of(13,30));


        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("All visits for: " + date);
        ArrayList<Visit> mondayVisitsAll =  mondaySchedule.searchForVisitByDay(date);
        mondayVisitsAll.forEach(System.out::println);
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println();
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("All visits for colour on " + date);
        ArrayList<Visit> mondayVisitsColour = mondaySchedule.searchForVisitByDayAndSpecialisation("colour",date);
        System.out.println(" ------------------------------------------------------------- ");

    }
}