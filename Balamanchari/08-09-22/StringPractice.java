package eightnine;

public class StringPractice {

	private static int s3;

	public static void main(String[] args) {
		
		String str="balamanchari";
		System.out.println(str.codePointAt(5));
				// it print the ascii value of a
		
		System.out.println(str.charAt(4));
				// index value of 4
		
		System.out.println(str.codePointBefore(3));
		//3-1=2 ascii value of 2
		
		System.out.println(str.codePointCount(3, 8));
		
		System.out.println(str.compareTo("bala"));
		
		System.out.println(str.compareToIgnoreCase("Bala"));
		//it ignores the lowercase and uppercase
		
		System.out.println(str.concat("murugadas"));
		
			//given value is present or not in given string
		
		System.out.println(str.contentEquals("balamanchari"));
		
		System.out.println(str.contains("bala"));
		
		System.out.println(str.endsWith("ri"));
		
		System.out.println(str.equals("balamanchari"));
		
		System.out.println(str.formatted("null"));
		
		System.out.println(str.hashCode());
		
		System.out.println(str.indent(4));
		//margin
		String str1="";
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		
		System.out.println(str.lastIndexOf("r"));
		
		System.out.println(str.length());
		
		System.out.println(str.offsetByCodePoints(2,8));
		
		System.out.println(str.repeat(7));
		
		System.out.println(str.replace("ba", "Ba"));
		
		System.out.println(str.replaceFirst("bala", "BALA"));
		
		System.out.println(str.startsWith("ll"));
		
		System.out.println(str.strip());
		
		String str2=" Bal amanchrai  ";
		System.out.println(str2.stripIndent());

		System.out.println(str.substring(5));
		
		System.out.println(str.substring(2, 6));
		
		System.out.println(str.toCharArray());
		
		System.out.println(str2.toLowerCase());
		
		System.out.println(str.toUpperCase());
		String s1="bala"; String s2="balamachari";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.getBytes());
		System.out.println(s1.subSequence(2, 3));
		System.out.println(s1.split(s2, 2));
		
		System.out.println(str.valueOf(s2));
	}

}
