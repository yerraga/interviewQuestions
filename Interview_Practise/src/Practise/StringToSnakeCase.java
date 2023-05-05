package Practise;

public class StringToSnakeCase {
	public static void main(String[] args) {
		System.out.println(toSnakeCase("whatIsYourName"));
		System.out.println(regexSnakeCase("whatIsYourName"));
	}
	public static String toSnakeCase(String str ) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.append("_").append(Character.toUpperCase(ch));
			}
			else {
				sb.append(Character.toUpperCase(ch));
			}
		}
		return sb.toString();
	}
	public static String regexSnakeCase(String str) {
		return str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase();
	}
}
