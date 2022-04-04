package assignments3;

public class Students {
	String name;
	int age;
	char section;
	char gender;
	int subject1, subject2, subject3;
	int total, avg;
	public Students(String n, int a, char s, char g, int sub1, int sub2, int sub3) {
		name=n;
		age=a;
		section=s;
		gender=g;
		subject1=sub1;
		subject2=sub2;
		subject3=sub3;
		total=sub1+sub2+sub3;
		avg=total/3;
	}
	public Students(String n, int a, char s, char g, int sub2, int sub3) {
		name=n;
		age=a;
		section=s;
		gender=g;
		subject2=sub2;
		subject3=sub3;
		total=sub2+sub3;
		avg=total/2;
	}
	void display(){
		System.out.println(name+"   "+age+"     "+section+"      "+gender+"     "+subject1+"         "+subject2+"       "+subject3+"     "+total+"   "+avg+"%");
	}
	

public static void main(String[] args) {
	Students s1=new Students("Abc",15,'A','M',20,30,40);
	Students s2=new Students("efg",16,'B','F',25,35,70);
	Students s3=new Students("kyg",17,'C','M',37,81);
	Students s4=new Students("ftg",18,'D','F',31,92);
	System.out.println("name age section gender subject1 subject2 subject3 total avg%");
	s1.display();  
    s2.display(); 
    s3.display();  
    s4.display();
    
}
}
