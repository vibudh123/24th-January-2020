import java.util.*;
class SecondSmallest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
        	arr[i]=sc.nextInt();
        }
        System.out.println("Second Smallest number is:" + getnumber(arr));
	}


	static int getnumber(int []array){
       Arrays.sort(array);
       int number=0;
       for(int i=0;i<array.length-1;i++){
       	if(array[i]!=array[i+1]){
       		number=array[i+1];
       		break;
       	}
       }return number;
        }  
  }