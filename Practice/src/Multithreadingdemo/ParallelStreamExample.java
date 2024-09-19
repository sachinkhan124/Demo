package Multithreadingdemo;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
     
		List<String> lists = Arrays.asList("a","b","c","d","e");
		Instant timestamp = Instant.now();
		lists.parallelStream().forEach( element ->{
                // Get the current timestamp
     
			
                System.out.println("element: " + element );
                try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
            });
		 System.out.println(Duration.between(Instant.now(), timestamp));
		 
		 Instant timestamp1 = Instant.now();
		
		lists.stream().forEach( element ->{
            // Get the current timestamp
 
		
            System.out.println("element2: " + element );
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
        });
		 System.out.println(Duration.between(Instant.now(), timestamp1));
		 
		
		//lists.parallelStream().forEach(element -> System.out.println("element:"+ element));
		
		//lists.stream().parallel().forEach(element -> System.out.println("element:"+element));
		
		//lists.parallelStream().forEachOrdered(element -> System.out.println("element:"+element));

	}

}
