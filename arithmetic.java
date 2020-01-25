class Arithematic{
	public static void main(String[] args) {
		int firstnum = Integer.parseInt(args[0]);
		int secondnum = Integer.parseInt(args[1]);
		for(int i=1;i<=secondnum;i++){
			int result = firstnum*i;
			System.out.print(firstnum + " * " + i + " = " + result);
		}
	}
}
