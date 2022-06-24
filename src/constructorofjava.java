
public class constructorofjava {
	
    int rno;
	String name;
	float percentage;
	

	constructorofjava(int Rollno, String  Name, float  Percentage){
		rno=Rollno;
		name = Name;
		percentage= Percentage;
		
	}
	void display() 
	{
		System.out.println("Rollno="+rno);
		System.out.println("Student Name="+name);
		System.out.println("student percentage="+percentage);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorofjava s1=new constructorofjava(101, "Pratiksha",90.87f);
		s1.display();
		
		constructorofjava s2=new constructorofjava(102, "Pratik" ,88.87f);
		s2.display();
	}

}
