public class NewCar {
    private String _color;
    private double _price;

    public NewCar(double cost, String color) {
        _color = color;
        _price = cost * 2;
    }

    public boolean equals(NewCar obj) {
        return _price == obj._price && _color.equals(obj._color);
    }

    public double getPrice() {
        return _price;
    }

    public void display() {
        System.out.println("price = $ " + _price + ", color = " + _color);
    }
}