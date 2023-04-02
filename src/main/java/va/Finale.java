package va;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Finale {
    private Finale(){
        throw new IllegalStateException("Utility class");
    }

    public static void end(Date date, String report){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date2 = new Date();
        long delta = date2.getTime()-date.getTime();
        int minutes = (int)(delta/60000);
        int seconds = (int)(delta/1000)-(minutes*60);
        System.out.println(report);
        System.out.println("\nTerminé en "+ minutes+" minutes "+seconds+" à: "+simpleDateFormat.format(date2)); 
    }
}
