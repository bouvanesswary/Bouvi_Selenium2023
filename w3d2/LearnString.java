package week3.w3d2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// literal declaration
			String name="Testleaf";
			String name1="Testleaf";
			
			//instantiation - string objects
			String str=new String("TestLeaf");
			
			// to compare two string values
			
			// difference between == and .equals()
			
			// == will check only for the references and it will not check the content inside the string
			
			// .equals() is compare the content of two strings
			
			System.out.println(name==str);
			System.out.println(name.equals(str));
			System.out.println(name.equals(name1));
			
			// in string length is an method but in an array method is a property
			int len=name.length();
			System.out.println(len);

			// compare two strings ignore case sensitivity
			System.out.println(name.equalsIgnoreCase(name1));
			
			//contains
			System.out.println(name.contains("Test"));
			
			//Convert string to Lower to upper
			System.out.println(name.toLowerCase());
			System.out.println(name.toUpperCase());
			
			// tochar arrary
		    char[] cha=name.toCharArray();
			System.out.println(cha[2]);
			for (int i = 0; i < cha.length; i++) {
				
				System.out.println(cha[i]);
			}
			
			
			
			// Beginning index
			String sub =	name.substring(5);
			System.out.println(sub);
			
			// beginning and End Index
			String sub1 = name.substring(2, 5);
			System.out.println(sub1);
		
			System.out.println("================ Replace All ================");
			
			String str1=" Chennai 600100";
			String replaceAll = str1.replaceAll("[^0-9]", "");
			System.out.println(replaceAll);
			String replaceAll1 = str1.replaceAll("[^a-zA-Z]", "");
			System.out.println(replaceAll1);

			String str3="Chennai %, 600100"; 
			String replaceAll2 = str3.replaceAll("%,", "");
			System.out.println(replaceAll2);
			
			// number format exception when there is any special characters
			//String number="9,123";
			//int parseInt = Integer.parseInt(number);
			//System.out.println(parseInt);
			
			// so to avoid number format exception we use replace all
			String number1="9,123";
			String replaceAllnum = number1.replaceAll(",", "");
			int parseInt1 = Integer.parseInt(replaceAllnum);
			System.out.println(parseInt1);
			
	}

}
