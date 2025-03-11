package shapes;

public class Shape {
	
	public static void main(String[] args) {
		Square cuadrado = new Square("Cuadrado");
		System.out.println( cuadrado.name );
	}
	
}

class TwoDimensionalShape {
	public String name = "TwoDimensinal";
	
	{
		name = "shape";
	}

	public TwoDimensionalShape(String name) {
		this.name = name;
	}
}

class Square extends TwoDimensionalShape {

	public Square(String name) {
		super(name);
	}
	
}
