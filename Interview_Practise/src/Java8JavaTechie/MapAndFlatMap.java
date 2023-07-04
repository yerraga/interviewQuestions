package Java8JavaTechie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John Doe",
				  "Jane Doe",
				  "Bill Smith",
				 "Susan Smith",
				  "Michael Jones",
				  "Sarah Jones",
				 "David Williams",
				  "Emily Williams",
				 // "Thomas Brown",
				 // "Laura Brown",
				 // "James Green",
				 // "Mary Green",
				 // "Christopher White",
				//  "Jennifer White",
				//  "Robert Black",
				 // "Nancy Black",
				 // "Daniel Garcia",
				 // "Maria Garcia",
				  //"Peter Hernandez",
				  "Laura Hernandez");
	//	list.stream().sorted().map(names -> names + " ").collect(Collectors.toList()).
		//forEach( names -> System.out.println(names));
		List<String> list1 = Arrays.asList(
				  "Afghanistan",
				  "Albania",
				  "Algeria",
				  "Andorra",
				 // "Angola",
				 // "Antigua and Barbuda",
				 // "Argentina",
				  //"Armenia",
				 // "Australia",
				 // "Austria",
				 // "Azerbaijan",
				 // "Bahamas",
				 // "Bahrain",
				 // "Bangladesh",
				 // "Barbados",
				 // "Belarus",
				 // "Belgium",
				 // "Belize",
				 // "Benin",
				  "Bhutan"
				);
		List<List<String>> finalList = new ArrayList<>();
		finalList.add(list);
		finalList.add(list1);
		finalList.stream().flatMap(finalList1 -> finalList1.stream()).
		collect(Collectors.toList()).forEach(System.out::println);
	}
}
