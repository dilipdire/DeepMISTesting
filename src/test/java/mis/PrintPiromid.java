package mis;

public class PrintPiromid {
	
	public static void main(String[] args) {
		
		for(int i=0;i<6;i++)
		{
			for(int j=6-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	
	
	for(int x=0;x<=7;x++)
	{
		for(int y=7-x;y>1;y--)
		{
			System.out.print(" ");
		}
		for(int z=0;z<=x;z++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println("------------------------------");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j +" ");
		}
		System.out.println();
	}
	
	System.out.println("========================");
	for(int i=0;i<=6;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	}

}
