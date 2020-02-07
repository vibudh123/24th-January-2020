import java.util.*;
class NewEmployeeDemo{
	public static List list = new ArrayList();
	
	public static void main(String[] args) {
		boolean flag = true;
		list.add(new Employee("Aditya Sharma",21));
		list.add(new Employee("Vakul Goyal",19));
		list.add(new Employee("Utkarsh Gupta",25));
		Scanner scan = new Scanner(System.in);
		while(flag==true){
		System.out.println("Do you want to add  New Name(Name, Age) :(Y/N)");
		
		char ch =scan. next(). charAt(0);
		if(ch=='Y')
		{System.out.println("Enter Name :");
		String na = scan.nextLine();
		System.out.println("Enter Age :");
		int age = scan.nextInt();
		list.add(new Employee(na,age));}
		else{
			flag=false;
		}
		}
		
		System.out.println("Sorted by the age");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Sorted by the Name");
		Collections.sort(list, new SortByName());
		System.out.println(list);
		System.out.println("Sorted by the LastName");
		Collections.sort(list, new SortByLastName());
		System.out.println(list);

	}
	
}
class Employee implements Comparable{
	String name;
	int age;

	Employee(String name,int age){
		this.age=age;
		this.name=name;

	}

	public Integer getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Object obj){
		return (this.getAge().compareTo(((Employee)obj).getAge()));
	}

	@Override
	public String toString(){
		return this.getName()+ " " + this.getAge();
	}
}
class SortByName implements Comparator{

	@Override
	public int compare(Object first,Object second){
		return ((Employee)first).getName().compareTo(((Employee)second).getName());
	}
}
class SortByLastName implements Comparator{
	@Override
	public int compare(Object first,Object second){
		
		String [] arrFirst = ((Employee)first).getName().split(" ");
		String [] arrSecond = ((Employee)second).getName().split(" ");
		String str1="",str2="";
		if(arrFirst.length > 1){
			str1=arrFirst[1];
		}
		if(arrSecond.length > 1){
			str2=arrSecond[1];
		}
		return str1.compareTo(str2);
	}
}
