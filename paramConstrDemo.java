

//parameterized constructor
class Std1{
	int id;
	String name;

	Std1(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrDemo
{
	public static void main(String[] args) {

		Std1 std1=new Std1(2,"Alex");
		Std1 std2=new Std1(10,"Annie");
		std1.display();
		std2.display();
			}
}


