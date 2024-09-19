package abstractdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalprogrammingExample {

	public static void main(String[] args) {
       List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       
      List<Integer> evenNumbers = lists.stream().filter(s -> s%2 ==0).map(s -> s*s).collect(Collectors.toList());
      System.out.println(evenNumbers);
      
      System.out.println("------------------------------------------------------------------");
      
      List<String> list = Arrays.asList("a","b","c","d","e","f");
      
      Stream<String> streamList = list.stream();
      
      Stream<String> transformedStream = streamList.filter(s -> s.compareTo("c")>0).map(String :: toUpperCase).sorted();
      
      //transformedStream.forEach(System.out::println);
      
      List<String> resultList = transformedStream.collect(Collectors.toList());
      
       System.out.println(resultList);
     
       System.out.println("-------------------------------------------");
       
       Stream<String> valuesof = Stream.of("a","b","c","d","e","f","g");
       
       valuesof.forEach(System.out::println);
       
       System.out.println("--------------------------------------------------------------------------------------------");
       
       List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

       // Using streams to filter and transform the list
       names.stream()
            .filter(name -> name.startsWith("C"))
            .map(String::toUpperCase)
            .forEach(System.out::println); 
   
       
       
       System.out.println("----------------------------------------------------");
       
       List<String> list1 =Arrays.asList("abcdef","defaa","xyz","pqr");
       
       List<String> streams = list1.stream().filter(s -> s.length()> 5).map(String :: toUpperCase).sorted().collect(Collectors.toList());
       
       System.out.println(streams);
       
       System.out.println("-------------------------------------------------------------------------");
       
      list1.stream().filter(s -> s.startsWith("p")).map(String ::toUpperCase).forEach(System.out:: println);
       
       
       
	}

}
