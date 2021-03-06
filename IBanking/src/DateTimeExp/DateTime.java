package DateTimeExp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;

public class DateTime {
	
	public static void main(String[] args) {
		LocalTime currenttime=LocalTime.now();
		System.out.println(currenttime);
		
		LocalDateTime currdate = LocalDateTime.now();
		System.out.println(currdate);
		
		ZoneId tokyoTime = ZoneId.of("Asia/Tokyo"); 
		System.out.println(tokyoTime);
		
		LocalTime japan = LocalTime.now(tokyoTime);
		System.out.println(japan);
		
	}
	

}
