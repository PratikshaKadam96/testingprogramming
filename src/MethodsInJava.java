
public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsInJava mj=new MethodsInJava();
        int result=mj.add(30,40);
        System.out.println("Result="+result);
        int result1=mj.add(300,400)+100;
        System.out.println("Result1="+result1);
        
        
        int a[]= {2,40,20,1,36};
        System.out.println("min no is="+mj.minnumber(a));
	}
	
	
	int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	
	
	
	
	int minnumber(int a[])
	{
		int minnumber=a[0];
		for(int i=1;i<a.length;i++) {
			if(minnumber>a[i]) {
				minnumber=a[i];
			}
		}
		return minnumber;
	}
     
	int[] sort(int a[]) {
	
	return a[];
	}
}
	


