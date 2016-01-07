package login.sms;
/*
 * Represent the students data
 * Punctuation removed
 * */

public class StudentData {
		int data [] = {-1, 0, 4, 42, 84};
		public void  display() 
		{
			System.out.println("This is your Data ");
			int sum=0;
			for(int i:data)			
			{
				System.out.println("Next value:" + data[i]);
				sum+=i;
			}
			System.out.println("Sum is: " + sum);
		}
		
		
	
}
