
public class UsedCar {
        private int _mileage;
        private double _price;

        public UsedCar(double cost, int mileage) {
            _price = cost * 2;
            _mileage = mileage;
        }

        public boolean equals(UsedCar obj) {
            return _price == obj._price && _mileage == obj._mileage;
        }

        public double getPrice() {
            return _price;
        }

        public void display() {
            System.out.println("price = $ " + _price + ", mileage = " + _mileage);
        }

    }
