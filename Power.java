import java.util.*;
class Power{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		System.out.println(PowerOftwo(n));

	}
	static boolean PowerOftwo(int number){

		if(number<=1){
		   return false;
		}
   
  		while(number > 1){
   			if(number % 2 != 0){
    			return false;
   			}
   			number = number / 2;
  		}
  	return true;
 	}
}