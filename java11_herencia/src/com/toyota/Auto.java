package com.toyota;

public class Auto {
	public static void main(String[] args) {
		Sedan mabel = new Yaris("Yaris", "Escarlata");
		Sedan elchulo = new YarisHybrid("YH", "Plateado");
	}

}

class Sedan {
	String model = "sedan";
	{
		this.model = "comun";
	}
	public Sedan(String model) {
		this.model = model;
	}
}

class Yaris extends Sedan {
	String color = "blanco";
	
	{
		this.color = "primer";
	}
	
	public Yaris(String model, String color) {
		super(model);
		this.color = color;
	}
}

class YarisHybrid extends Yaris {
	boolean hybrid = false;
	
	{
		this.hybrid = true;
	}
	
	YarisHybrid(String model, String color){
		super(model, color);
		this.hybrid = true;
	}
}
