package project1;

public class String_Rev {

	public static void main(String[] args) {
		String str = "Maven";
		System.out.println("Reverse of a String " +str+ " is ");
		for(int j=str.length();j>0;--j)
		{
			System.out.println(str.charAt(j-1));
		}
	}
}
