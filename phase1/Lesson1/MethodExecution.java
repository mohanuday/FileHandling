package Lesson1;

public class MethodExecution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
		}
		public static void main(String[] args) {
		MethodExecution b=new MethodExecution();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}
		//call by value
		public class callMethod {
		int val=150;
		int operation(int val) {
		val =val*10/100;
		return(val);
		}
		public  void main(String args[]) {
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
		}
}