import java.util.Scanner;
class FibonacciPlay{
public static void main(String args[])  
{    
  Scanner scan = new Scanner(System.in);
  int n= scan.nextInt();
  new FibonacciPlay().fibonnaci(n);
  System.out.println(fib(n));
}
void fibonnaci(int count){
	int i=0,n1=1,n2=1;
 for(i=2;i<count;++i)    
 {    
  int n3=n1+n2;    
  // System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }

 System.out.println(n2);   
}
static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
}