import java.util.*;
class StarLetter
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String s=sc.nextLine();
		int i,j;
		char []a=s.toCharArray();
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}
}