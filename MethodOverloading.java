package module1programs;

public class MethodOverloading {

	static void add(int a,double b) {
		
		double sum=a+b;
		System.out.println(sum);

	}

	static void add(int a,double b,int c) {
		
		double sum=a+b+c;
		System.out.println(sum);

	}

	static void add(double a,int b) {
		
		double sum=a+b;
		System.out.println(sum);

	}

	 void add(double a,double b) {
		 
		 double sum=a+b;
			System.out.println(sum);

	}

	 void add(int a,int b) {
		 
		 double sum=a+b;
			System.out.println(sum);

	}

	public static void main(String[] args) {
		
		add(45,6.7);
		add(45,6.7,7);
		add(6.7,8);
		
		MethodOverloading m1=new MethodOverloading();
		
		m1.add(4.4, 3.7);
		m1.add(4, 7);

	}

}
