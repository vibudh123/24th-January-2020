import java.util.*;
class CustomClassCollectionAPI{
	public static java.util.List list = new java.util.ArrayList();
	public static boolean flag = true;
    public static void main(String[] args) {
		
        Computer first = new Computer("HP", "black", 500, 8, 2131);
        list.add(first);
        list.add(new Computer("HP", "black", 256, 4, 423));
        list.add(new Computer("Sony", "blue", 1024, 16, 123));
 		while(flag==true){
		new CustomClassCollectionAPI().display();
 		new CustomClassCollectionAPI().cases();
 	}
 	}
 		public void cases(){
 			Scanner scan = new Scanner(System.in);
 			int choice= scan.nextInt();
 			switch(choice){
 			case 1:
 			System.out.println("Adding a new Computer");
 			add();

 			break;
 			
 			case 2:
 			System.out.println("List : " + list);
 			break;
 			
 			case 3:
 			search();
 			break;
 			
 			case 4:
 			remove();
 			
 			break;

 			case 5:
 			update();
 			
 			break;

 			case 6:
 			flag= false;
 			break;
 			default:
 			System.out.println("Next");



 		}
 		display();
 		}
 		public void add(){

 			Scanner in = new Scanner(System.in);
 			System.out.println("Enter Brand");
 			String a = in.nextLine();
 			System.out.println("Enter Color");
 			String b = in.nextLine();
 			System.out.println("Enter hddSize");
 			int c = in.nextInt();
 			Integer q = new Integer(c);
 			System.out.println("Enter ramSize");
 			int c1 = in.nextInt();
 			Integer q1 = new Integer(c1);
 			System.out.println("Enter ID");
 			int c2 = in.nextInt();
 			Integer q2 = new Integer(c2);
 			
 			list.add(new Computer(a,b,q,q1,q2));
 			
 		}
 		public void display(){
 			Scanner scan = new Scanner(System.in);
 			System.out.println("1. Add a new Computer\n2. Display all computers\n3. Search for a computer : By Name, Color, HDDSize, RamSize, ID\n4. Delete a computer : By ID\n5. Update Computer Details: Name, Color, HDDSize, RamSize");
			System.out.println("Enter your choice to proceed :");
			cases();

			
 		}
 		public void search(){
 			Scanner scan = new Scanner(System.in);
 			System.out.println("Enter your search by id here");
 			int sear = scan.nextInt();
 			boolean f= true;
 			for(Object ref : list){
 				if(((Computer)ref).getidentity()==sear){
 					f=true;
 					System.out.println((Computer)ref);
 					break;
 				}
 				else
 					f=false;
 			}
 			if(f==true){
 				System.out.println("Yes it is present");
 				
 			}
 			else
 				System.out.println("Not present");

 		}
 		public void remove(){
 			Scanner scan = new Scanner(System.in);
 			System.out.println("Enter your id  for deletion:");
 			int i = scan.nextInt();
 			for(Object ref : list){
 				if(((Computer)ref).getidentity()==i){
 					
 					list.remove(ref);
 					break;
 				}
 			}
 			System.out.println(list);

 		
		}
		public void update(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = scan.nextInt();
			int index=0;
			for(Object ref : list){
 				if(((Computer)ref).getidentity()==id){
 					System.out.println("Found your choice, Now enter the type you want to change");
 					System.out.println("Brand or Color or hddSize or ramSize");
 					String choose = scan.next();
 					String brand = ((Computer)ref).getBrand();
 					String color = ((Computer)ref).getColor();
 					Integer hdd = ((Computer)ref).getHddSize();
 					Integer ram = ((Computer)ref).getHddSize();
 					
 					
 					switch(choose){
 						
 						case "Brand":
 						String n = scan.next();
 						list.set(index,new Computer(n, color, hdd,ram,id));
 						break;
 						
 						case "Color":
 						String p = scan.next();
 						list.set(index,new Computer(brand, p, hdd,ram,id));
 						break;
 						
 						case "hddSize":
 						int w = scan.nextInt();
 						list.set(index,new Computer(brand, color, w,ram,id));
 						break;
 						
 						case "ramSize":
 						int t = scan.nextInt();
 						list.set(index,new Computer(brand, color, hdd,t,id));
 						break;
 						
 						default:
 						System.out.println("Enter a valid name");
 						break;
 					}
 				}
 			}
 			index++;

		}

}
 
class Computer{
    String brand, color;
    int hddSize, ramSize, identity;
 
    Computer(String brand, String color, Integer hddSize, Integer ramSize, Integer identity){
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.identity = identity;
    }
 
    public String getColor(){
        return this.color;
    }
 
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }
 	
 	public Integer getidentity(){
 		return this.identity;
 	}

    @Override
    public String toString(){
        return "Computer : (" + this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ", " + this.getidentity()
            + ")";
    }
}