package functionoverload;

public class Sum {
	int i;
	public int Calculate(int a, int b)
	{
	return (a+b);
	}
	public float Calculate(float a, float b)
	{
		i = (int) (3.14*a*b);
		return i;
	}
	float calculate(int l,float w)
	{
		return (l*w);
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println ("\nSum of two numers: "+s.Calculate (10,20));
		System.out.println ("\nArea of Cricle:" +s.Calculate (10f,20f));
		System.out.println ("\nArea of Rectangle:"+s.calculate (2,3f));
	}
}
