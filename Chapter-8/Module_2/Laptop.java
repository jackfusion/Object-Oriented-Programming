package Module_2;

public class Laptop {
	
	private double _price;
	private String _brand;

	public Laptop(double cost, String brand) {
		_price = cost * 1.5;
		_brand = brand;
	}

	public void setBrand(String newBrand) {
		_brand = newBrand;
	}
	
	public String getBrand() {
		return _brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return _brand + " $" + _price;
	}

}
