import java.util.*;
class Decimal{
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int sec = first;
		StringBuffer sb = new StringBuffer("");
		while(sec!=0){
			int rem = sec%2;
			sb.append(rem);
			sec = sec/2;
		}
		String s = sb.toString();
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
	}
}
