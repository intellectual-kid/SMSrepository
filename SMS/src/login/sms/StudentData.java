package login.sms;
/*
 * Represent the students data
 * Punctuation removed
 * */

public class StudentData {
		int data [] = {-2, -1, 0, 4, 42, 84, 56, 76, 47};
		public void  display() 
		{
			System.out.println("Your Desired values are given below. ");
			int sum=0;
			for(int i=0;i<data.length;i++)			
			{
				System.out.println("Next value:" + data[i]);
				sum+=i;
			}
			System.out.println("Sum is: " + sum);
		}
		
		
	
}
