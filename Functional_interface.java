package java8;

interface sum{
	abstract int Calculate(int a, int b);
}
interface simple{
	 abstract String hello(String name);
	 }

public class Functional_interface {
	public static void main(String[] args) {
		sum s1=(int a,int b)->a*b;
		int ans=s1.Calculate(11, 3);
		System.out.println(ans);
		
		sum s2=(int a,int b)->a-b;
		int an=s1.Calculate(18, 3);
		System.out.println(an);
		
		simple s3=(String n)->"hello\t"+n+"\tGood afternoon";
		String a=s3.hello("java");
		System.out.println(a);
	}
}
