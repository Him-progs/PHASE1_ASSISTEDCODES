import java.util.*;


public class empDetails
{
	int empno;
	String Ename;
	int salary;
	
	empDetails (int empno, String Ename, int salary )
	{
		this.empno = empno;
		this.Ename = Ename;
		this.salary = salary;
	}
	public String toString()
	{
		return empno+" "+Ename+" "+salary;
	}
}
class Emp1
{
	public static void main(String[]args)
	{
		int choice = -1;
		Scanner E = new Scanner (System.in);
		do{
			System.out.println("1:Add in to the file");
			System.out.println("2:Display the file");
			System.out.println("0:EXIT");
			System.out.println("Enter Your Choice:");
			choice = E.nextInt();
		}
		while(choice !=0);
	}
}