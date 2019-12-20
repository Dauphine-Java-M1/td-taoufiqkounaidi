package fr.dauphine.ja.kounaiditaoufiq.td01;

public class Ring extends Circle {
	
	@SuppressWarnings("unused")
	private double rayonIntere;
	private double rayonRing;
	

	public Ring(Point cpoint, double r, double ri) {
		super(cpoint, r);
		this.rayonIntere=ri;
		
	}
	
	public boolean equals(Ring ring) {
		return super.getRayon()==rayonRing;
	}
	
	@Override
	public String toString() {
		return "Center :" +super.getCenterPoint()+ "| radius :" +super.getRayon()+"| radius interne :"+getrayonInterne();
	}
	
	// à revoir
	public boolean contains(Point p) {
		if (p.calculDistance(p) < getRayon()) return true;
		return false;
	}
	public double getrayonInterne() {
		return this.rayonIntere;
	}

}
