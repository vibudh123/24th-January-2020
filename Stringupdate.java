class Stringupdate{
	public static void main(String[] args) {
	 
		StringBuffer buffer = new StringBuffer("Hello Strings");
		System.out.println(buffer);
		buffer.append(" in Java");
		StringBuffer strn = new StringBuffer("Hey i am a string");
		System.out.println(strn.replace(3,8,"whatsup"));

	 } 