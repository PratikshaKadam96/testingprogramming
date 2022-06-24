
public class defaultconstructor {
	
	 int rno;
		String name;
		float percentage;
	static int cnt=0;

	defaultconstructor(){
		
		rno=0;
	    name=null;
	    percentage=0.0f;
	    cnt++;
	}
	defaultconstructor(int Rollno, String  Name, float  Percentage){
			rno=Rollno;
			name = Name;
			percentage= Percentage;
			cnt++;
			
		}
		void display() 
		{
			System.out.println("Rollno="+rno);
			System.out.println("Student Name="+name);
			System.out.println("student percentage="+percentage);
			System.out.println("total no of count="+cnt);
			
			}

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			defaultconstructor s1=new defaultconstructor(101,"Pratiksha",90.87f);
		s1.display();
		
		defaultconstructor s2=new defaultconstructor(102,"Pratik",88.87f);
		s2.display();

	}

}
