import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        DrawCircle circle = new DrawCircle();
        int radius;

        System.out.print("What radius would you like for the circle? ");
        radius = stdIn.nextInt();

        circle.setRadius(radius);
        circle.draw();
    }
}


class DrawCircle {
    private int _radius;

    public void setRadius(int value) {

        // if (value < 0 || value > 9) {
        //     System.out.println();
        // } else {
        _radius = value;
        //}

    }

    public int getRadius() {
        return _radius;
    }

    public void draw()
    {
        for (int y = -_radius; y <= _radius; y += 2) {
			for (int x = -_radius; x <= _radius; ++x) {
				
				if(y * y + x * x <= _radius * _radius)
					System.out.print("*");
				else
					System.out.print(' ');
			}
			System.out.println();
		}
    }
}
