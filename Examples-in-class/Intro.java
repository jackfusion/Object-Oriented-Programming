
class Rectangle {
	
	private int _height;
	private int _width;
	private boolean _filled;
	private String _color = "white";
	
	public void setWidth(int value) {
		
		if(value < 0) {
			System.err.println("Incorrect value for Height");
		}
		else {
			_width = value;
		}
	}
	
	public int getWidth() {
		return _width;
	}
	
	public void setHeight(int value) {
		
		if(value < 0) {
			System.err.println("Incorrect value for Width");
		}
		else {
			_height = value;
		}
	}
	
	public int getHeight() {
		return _height;
	}
	
	public boolean getIsFilled() {
		return _filled;
	}
	
	public void setIsFilled(boolean value) {
		_filled = value;
	}
	
	
	public String getColor() {
		return _color;
	}
	
	public double getArea() {
		return _height * _width;
	}
	
	public double getPerimeter() {
		return (_height + _width) * 2;
	}
	
	public void draw() {
		
		for (int y = 0; y < _height; y++) {
			for (int x = 0; x < _width; x++) {

				boolean b = 
						!(y == 0 || y == _height - 1 || x == 0 || x == _width - 1) 
						&& !_filled;
				System.out.print( b ? ' ' : '*' );
			}
			System.out.println();
		}
	}
}

public class Intro {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setHeight(5);
		r1.setWidth(15);
		r1.setIsFilled(true);
		
		r1.draw();
	}
}
