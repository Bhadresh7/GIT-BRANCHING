class Sample
{
	void method()
	{
		static int a=20;
		System.out.println(a);
	}
	
	void method2()
	{
		method();
	}
	
	
public static void main(String args[])
{
	
	Sample s= new Sample();
	s.method2();
}
}