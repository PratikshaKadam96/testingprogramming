
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Totalrow=5;
		
		for(int row=1;row<=Totalrow;row++) 
		{
		for(int sp=1;sp<=Totalrow-row;sp++)
		{
			System.out.print(" ");
			
		}
for(int st=1; st<=2*row-1;st++)
{
	System.out.print("*");
}
	
System.out.println();
	
		}
	}
}
