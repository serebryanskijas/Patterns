import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WiseOwl {
    public static void main(String[] args) throws ParseException {
        Singleton wiseOwl = Singleton.getInstance();
        System.out.println(wiseOwl);
        Singleton wiseOwl2 = Singleton.getInstance();
        System.out.println(wiseOwl2);
        Event.makeEvent("A boy helping an old man to carry a heavy basket","01.01.2021");
        Event.makeEvent("A girl shouting at her mother","02.01.2021");
    }
}

class Singleton {
    private static final Singleton instance = new Singleton();
    private int wisdom = 0;

    private Singleton() {
        System.out.println("There was an old owl that lived in an oak");
    }

    public void incWisdom() {
        wisdom++;
    }

    public int getWisdom() {
        return wisdom;
    }

    public static Singleton getInstance() {
        return instance;
    }
}

class Event {

    private final String name;
    private final Date date;

    Event(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        //String sDate = dateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String sDate = dateFormat.format(calendar.getTime());
        return sDate;
    }

    public static Event makeEvent(String name, String sDate) throws ParseException {

        Event event = new Event(name, stringToDate(sDate));
        System.out.println(event.getDate() + " " + event.getName());
        Singleton wiseOwl = Singleton.getInstance();
        wiseOwl.incWisdom();
        System.out.println("the wisdom of the owl " + wiseOwl.getWisdom());
        return event;
    }

    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));
        return calendar.getTime();
    }
}