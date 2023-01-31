import java.util.Scanner;
class Info
{ 
	String name,dept,salary,id,join_date,desig;

	void InfoEmp()
	{
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Employee name:");
		name=s.nextLine();
		System.out.println("Enter Department name:");
		dept=s.nextLine();
		System.out.println("Enter ID:");
		id=s.nextLine();
		System.out.println("Enter salary:");
		salary=s.nextLine();}

	void M()
	{
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Employee name:");
		name=s.nextLine();

		System.out.println("Enter Department name:");
		dept=s.nextLine();
		
		System.out.println("Enter ID:");
		id=s.nextLine();
		
		System.out.println("Enter salary:");
		salary=s.nextLine();
		
		System.out.println("Joining date:");
		join_date=s.nextLine();
		
		System.out.println("Designation:");
		desig=s.nextLine();
	}
}


class Manager
{
	Info v=new Info();
	void show()
	{
		v.M();

		System.out.println();
		System.out.println("Employee Name:"+v.name);
		System.out.println("Department name:"+v.dept);
		System.out.println("ID:"+v.id);
		System.out.println("Salary:"+v.salary);
		System.out.println("Joining date:"+v.join_date);
		System.out.println("Designation:"+v.desig);
	}
}


class Employee
{
	Info v=new Info();
	void show1()
	{
	v.InfoEmp();
		System.out.println();
		System.out.println("Employee Name:"+v.name);
		System.out.println("Department name:"+v.dept);
		System.out.println("ID:"+v.id);
		System.out.println("Salary:"+v.salary);
	}
}

public class emp {

	public static void main(String[] args) {
		Manager m=new Manager();
		Employee e=new Employee();
		m.show();
		e.show1();
		
		
		
	}

}
