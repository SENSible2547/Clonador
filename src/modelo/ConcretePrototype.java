package modelo;

import modelo.ConcretePrototype;

public class ConcretePrototype implements Prototype{
	
	public String Label;
	
	public ConcretePrototype() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ConcretePrototype(ConcretePrototype p) {
		this.Label=p.Label;
	}
	
	
	@Override
	public Prototype clonar() {
		// TODO Auto-generated method stub
		return new ConcretePrototype(this);
	}

}
