package selfWork;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowInLondon = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(now);
        System.out.println(nowInLondon);
        for(String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
    }
}
