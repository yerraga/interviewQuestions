package Practise;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {
	public static void main(String[] args) {
		HashSet <String> hs = new HashSet<String>();
		hs.add("Wissen");
		hs.add("Infotech");
		hs.add("Technology");
		hs.add("Interview");
		System.out.println(hs);
		Iterator <String> itr = hs.iterator();
		while (itr.hasNext()) {
			String names = itr.next();
			System.out.println(names);
		}
	}

}
