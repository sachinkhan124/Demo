package abstractdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatebetweenMainClass {

	public static void main(String[] args) {
		
		ReportService reportService = new ReportService();
	
		DatebetweenMainClass dMainClass = new DatebetweenMainClass();
		
	    List<LocalDate> dates = List.of(LocalDate.of(2024, 7, 1),
	    		                        LocalDate.of(2024, 7, 2),
	    		                        LocalDate.of(2024, 7, 3),
	    		                        LocalDate.of(2024, 7, 4),
	    		                        LocalDate.of(2024, 7, 5) );
	    
	    
	    List<DateWiseCountdto> dateWiseCountdtos = new ArrayList<>();
	     DateWiseCountdto dateWiseCountdto = new DateWiseCountdto();
	     dateWiseCountdto.setDate(LocalDate.of(2024, 7, 2));
	     dateWiseCountdto.setCount(5);
	     dateWiseCountdto.setCountTotal(15);
	     dateWiseCountdtos.add(dateWiseCountdto);
	     
	     DateWiseCountdto dateWiseCountdto2 = new DateWiseCountdto();
	     dateWiseCountdto2.setDate(LocalDate.of(2024, 7, 3));
	     dateWiseCountdto2.setCount(10);
	     dateWiseCountdto2.setCountTotal(12);
         dateWiseCountdtos.add(dateWiseCountdto2);
         
         
         UserReportRequestdto requestData = new UserReportRequestdto();
         requestData.setDateToggleStatus(true);
         
         List<DateWiseCountdto> date = reportService.fillabsentBetweendates(dates, dateWiseCountdtos, requestData);
         
         for(DateWiseCountdto data : date)
         {
        	 System.out.println(data);
         }
          
			                
	
		
	}

}
