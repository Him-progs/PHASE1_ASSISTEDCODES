
class AAA{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class emp2 {

public static void main(String[] args) {

	AAA emp1=new AAA();
	AAA emp2=new AAA();

	emp1.display();
	emp2.display();
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class EMp1 {
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}


