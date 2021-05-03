package Module_2;

public class driver {

	public static void main(String[] args) {
		
		Laptop lt1 = new Laptop(800.55, "HP-1234");
		
		// lt2 => lt2.equals(lt1)
		Laptop lt2 = lt1;
		
		// lt2.setBrand("Lenovo-78911");
		lt2 = new Laptop(500, "Lenovo-78911");
		
		
		System.out.println(lt1);
		System.out.println(lt2);
		
		String str1 = new String("Hello Java");
		String str2 = str1;
		
		str2 = "Hello World";
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
