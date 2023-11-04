package src.java_date_time;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdAbbreviate {
    public static void main(String[] args) {
        for (String availableId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableId);
            var id = zoneId.getId();

            var abbreviation = zoneId.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            System.out.println(id + ": " + abbreviation);
        }
    }
}
