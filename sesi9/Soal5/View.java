public class View{
	public static void main (String[] args){
		Employee e = new Employee("ALI", 12000000);
		Employee em = new Manager
		("ALI", 12000000,"Informatika");
		System.out.println("Data Employee : \n"+e.getDetails());
		System.out.println("Data Manager : \n"+e.getDetails());
		em.cetak();
	}
}