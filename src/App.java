import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        //CASTING
        //modifica tipo di dato
        int x = (int)9.5;
        System.out.println(x);

        //DATE HOUR
        LocalDate y = LocalDate.now();
        DateTimeFormatter n = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //MMM=mag MMMM=maggio E=lun EEEE=luned'
        LocalTime z = LocalTime.now();
        LocalDateTime f = LocalDateTime.now();
        System.out.println(y.format(n));    
        System.out.println(z);    
        System.out.println(f); 
        
        //HASHMAP
        HashMap<String, String> capitali = new HashMap<String, String>();
        capitali.put("ita", "Roma");
        capitali.put("ita", "Roma");
        capitali.put("ger", "Berlino");
        System.out.println(capitali.get("ger"));
        //capitali.remove("fra");
        //capitali.clear();

        //ITERATORI
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Paolo");
        persone.add("Anna");
        Iterator<String> it = persone.iterator();
        while(it.hasNext()) {
            String persona = it.next();
            if (persona == "Anna") {
                it.remove();
            }
        }
        System.out.println(persone);
    }
}
