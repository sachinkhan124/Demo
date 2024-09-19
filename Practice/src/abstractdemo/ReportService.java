package abstractdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReportService {
	
	public  List<DateWiseCountdto> fillabsentBetweendates(List<LocalDate> dates ,List<DateWiseCountdto>  dateWiseCountList ,UserReportRequestdto requestData)
	{
		
	     Map<LocalDate, DateWiseCountdto>  dateWiseCountMap = new HashMap<>();
	     
	     for(LocalDate date : dates)
	     {
	    	 DateWiseCountdto dateWiseCountdto = new DateWiseCountdto();
	    	 dateWiseCountdto.setDate(date);
	    	 dateWiseCountMap.put(date, dateWiseCountdto);
	     }
	     
	     for(DateWiseCountdto data : dateWiseCountList)
	     {
	    	 DateWiseCountdto dateWiseCountdto = new DateWiseCountdto();
	    	 if(dateWiseCountdto.getDate() == null)
	    	 {
	    		 dateWiseCountdto.setDate(data.getDate());
	    	 }
	    	 dateWiseCountdto.setCount(dateWiseCountdto.getCount() + data.getCount());
	    	 dateWiseCountdto.setCountTotal(dateWiseCountdto.getCountTotal() + data.getCountTotal());
	    	 dateWiseCountMap.put(data.getDate(), dateWiseCountdto);
	     }
	     return dateWiseCountMap.values().stream().sorted(Comparator.comparing(DateWiseCountdto:: getDate)).collect(Collectors.toList());
	}

}
