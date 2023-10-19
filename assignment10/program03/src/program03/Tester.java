package program03;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Tester {
	public static int menu() {
		int choice;
		System.out.println("****************************************");
		System.out.println("0.Exit");
		System.out.println("1.Add");
		System.out.println("2.Delete");
		System.out.println("3.Find");
		System.out.println("4.Sort");
		System.out.println("5.Edit");
		System.out.print("Enter your choice=");
		choice = new Scanner(System.in).nextInt();
		System.out.println("****************************************");
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		LinkedList<Employee> empList = new LinkedList<Employee>();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				emp.acceptData();
				empList.add(emp);

				break;
			case 2:
				System.out.print("Enter the index you want to delete ");
				int index;
				index = new Scanner(System.in).nextInt();
				empList.remove(index);
				System.out.println("employee at index[" + index + "] deleted");
				break;
			case 3:
				System.out.print("Enter the id of employee you want to find= ");
				int id;
				id = new Scanner(System.in).nextInt();
				Employee emp2 = new Employee();
				emp2.setEmpid(id);
				if (empList.contains(emp2)) {
					int ind = empList.indexOf(emp2);
					emp2 = empList.get(ind);
					System.out.println(emp2);
				} else {
					System.out.println("Employee not present");
				}

				break;
			case 4:
				class comparatorEmployeeId implements Comparator<Employee>
				{
				  public int compare(Employee e1,Employee e2)
				  {
					int diff=e1.getEmpid()-e2.getEmpid();
					return diff;
				  }	
				}
				
				comparatorEmployeeId com=new comparatorEmployeeId();
				empList.sort(com);
				System.out.println("After sorting");
				System.out.println(empList);
				break;
				
			case 5:
				System.out.println("enter emp id to be modified");
				int id3;
				id3=new Scanner(System.in).nextInt();
				Employee emp3=new Employee();
				emp3.setEmpid(id3);
				int index3=empList.indexOf(emp3);
				if(index3==-1) 
				{
				 System.out.println("employee not found");	
				}else 
				{
				     Employee oldemp=empList.get(index3);
				     System.out.println("Employee found:"+oldemp);
				     System.out.println("Enter the new information for the employee");
				     Employee newemp=new Employee();
				     newemp.acceptData();
				     empList.add(index3, newemp);
				     System.out.println(empList);
				     
				}
				
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		}

	}

}
