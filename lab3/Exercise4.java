package lab3;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=modifyNumber(697);
		System.out.println(test);
		

	}
	static int modifyNumber(int number)
	{
		if(number%10==number)
		{
			return number;
		}
		else
		{
			String numstr;
			numstr=String.valueOf(number);
			StringBuffer sbf= new StringBuffer("");
			for (int i = 0; i < numstr.length()-1; i++) {
				
				
				int a=Integer.parseInt(String.valueOf(numstr.charAt(i)));
				int b=Integer.parseInt(String.valueOf(numstr.charAt(i+1)));
				sbf.append(Math.abs(a-b));
				
				
			}
			return Integer.parseInt(String.valueOf(sbf));
		}
		
		
		
	}
	
	/*static int modifyNumber(int number)
	{
		if(number%10==number)
		{
			return number;
		}
		else
		{
			String numstr;
			int mnumber=0;
			numstr=String.valueOf(number);
			for (int i = 0; i < numstr.length()-1; i++) {
				
				int a=Integer.parseInt(numstr.substring(i, i+1));
				int b=Integer.parseInt(numstr.substring(i+1, i+2));
				
				
				
				mnumber=(int) (mnumber+ Math.abs(a-b)*Math.pow(10, numstr.length()-2-i));
			}
			return mnumber;
		}
		*/
	}
