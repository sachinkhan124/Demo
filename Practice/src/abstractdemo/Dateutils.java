package abstractdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dateutils {
	
	
	private List<LocalDate> getBetweenDates(LocalDate startDate , LocalDate endDate)
	{
		List<LocalDate> dates = new ArrayList<>();
		LocalDate currentDate = startDate;
		while(!currentDate.isAfter(endDate))
		{
			dates.add(currentDate);
			currentDate = currentDate.plusDays(1);
		}
		return dates;
	}
	

	public static void main(String[] args) {
       Dateutils dateutils = new Dateutils();
       
       LocalDate startDate = LocalDate.of(2024, 7, 5);
       LocalDate endDate  = LocalDate.of(2024, 7, 1);
       
       List<LocalDate> dates = dateutils.getBetweenDates(startDate, endDate);
       
       for(LocalDate date : dates)
       {	   
       System.out.println(date);
       }
       
	}
	   
}
	
	


