package Java8JavaTechie;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class SortElementsInMap {
	public static void main(String[] args) {
		Map <String, Integer> map = new HashMap<>();
		map.put("Afghanistan", 93);
		map.put("Albania", 355);
		map.put("Algeria", 213);
		map.put("Andorra", 376);
		map.put("Angola", 244);
		map.put("Antigua and Barbuda", 1268);
		map.put("Argentina", 54);
		map.put("Armenia", 374);
		map.put("Australia", 61);
		map.put("Austria", 43);
		map.put("Azerbaijan", 994);
		map.put("Bahamas", 1242);
		map.put("Bahrain", 973);
		map.put("Bangladesh", 880);
		map.put("Barbados", 246);
		map.put("Belarus", 375);
		map.put("Belgium", 32);
		map.put("Belize", 501);
		map.put("Benin", 229);
		map.put("Bhutan", 975);
		map.put("Bolivia", 591);
		map.put("Bosnia and Herzegovina", 387);
		map.put("Botswana", 267);
		map.put("Brazil", 55);
		map.put("Brunei", 673);
		map.put("Bulgaria", 359);
		map.put("Burkina Faso", 226);
		map.put("Burundi", 257);
		map.put("Cambodia", 855);
		map.put("Cameroon", 237);
		map.put("Canada", 1);
		map.put("Cape Verde", 238);
		map.put("Central African Republic", 236);
		map.put("Chad", 235);
		map.put("Chile", 56);
		map.put("China", 86);
		map.put("Colombia", 57);
		map.put("Comoros", 269);
		map.put("Congo, Democratic Republic of the", 243);
		map.put("Congo, Republic of the", 242);
		map.put("Costa Rica", 506);
		map.put("Côte d'Ivoire", 225);
		map.put("Croatia", 385);
		map.put("Cuba", 53);
		map.put("Cyprus", 357);
		map.put("Czech Republic", 420);
		map.put("Denmark", 45);
		map.put("Djibouti", 253);
		map.put("Dominica", 1767);
		map.put("Dominican Republic", 1809);
		map.put("East Timor", 670);
		map.put("Ecuador", 593);
		map.put("Egypt", 20);
		map.put("El Salvador", 503);
		map.put("England", 44);
		map.put("Equatorial Guinea", 240);
		map.put("Eritrea", 291);
		map.put("Estonia", 372);
		map.put("Eswatini", 268);
		map.put("Ethiopia", 251);
		map.put("Federated States of Micronesia", 691);
		map.put("Fiji", 679);
		map.put("Finland", 358);
		map.put("France", 33);
		map.put("Gabon", 241);
		map.put("Gambia", 220);
		map.put("Georgia", 995);
		map.put("Germany", 49);
		map.put("Ghana", 233);
		map.put("Greece", 30);
		map.put("Grenada", 1473);
		map.put("Guatemala", 502);
		map.put("Guinea", 224);
		map.put("Guinea-Bissau", 245);
		map.put("Guyana", 592);
		map.put("Haiti", 509);
		//System.out.println(map);
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> countryWithCodes = itr.next();
			//System.out.println(countryWithCodes);
		}
		Consumer action = (result) -> System.out.println("true");
		
		Consumer empty = (result) -> System.out.println("false");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.filter(t -> t.getKey().startsWith("India")).findAny().ifPresentOrElse(entry -> System.out.println("true"), ()-> System.out.println("false"));;
	}

}
