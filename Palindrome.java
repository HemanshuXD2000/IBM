package project1;

public class Palindrome {
	
	public static void main(String[] args) {
		int num = 121;
		int t,s,rem;
		t=num;
		for(s=0;num>0;num/=10)
		{
			rem=num%10;
			s=(s*10)+rem;
		}
		if(s==t)
			System.out.println(t+ " is a palindrome");
		else {
			System.out.println(t+ " is not a palindrome");
		}
		
	}

}
