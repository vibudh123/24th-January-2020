import java.util.*;
class Job{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Please enter the username : ");
		String s = n.nextLine();
		if(new JobSeeker().check(s)){
			System.out.print("accepted!!");
		}
		else{
			System.out.print("Does not fit the criteria");
		}
	}
	public boolean check(String s){
		if(s.length()>=12){
			int flag = false;
			if(s.charAt(s.length()-1)=='b'){
				if(s.charAt(s.length()-2)=='o'){
					if(s.charAt(s.length()-3)=='j'){
						if(s.charAt(s.length()-4)=='_'){
							flag = true;
						}
					}
				}
			}
			if(flag==true){
				flag=true;
			}
			else{
				flag=false;;
			}
		}
		else{
			flag= false;
		}

		return flag;
	}
}