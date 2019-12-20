package fr.dauphine.ja.kounaiditaoufiq.td01;

public class Main {

	public static void main(String[] args) {
		/* question 1
		Point p = new Point();
		Point p1 = new Point(1,2);
		Point p2 = new Point();
		
		System.out.println(p.x + " " + p.y);
		//nombre d'objets créés
		System.out.println(Point.noOfObjects);
		System.out.print(point);
		*/
		/* question 2
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		*/
		
		/* question 3
		Point p1 = new Point(1,2);
		Point p2 = new Point(2,3);
		System.out.println(p1.isSameAs(p2));
		*/
		/*
		Point p1=new Point(1,2);
		Point p2=p1;
		// Point p3=new Point(1,2);
		Point p3 = p2; //correction
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1); // [(1,2)]
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		*/
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,3);
		Point p3 = new Point(2,2);
		Point p4 = new Point(4,2);
		//LigneBrisee l = new LigneBrisee(3);
		LigneBrisee l = new LigneBrisee();
		
		System.out.println(p1);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		System.out.println(l);
		
		
		System.out.println(l.pointCapacity());
		System.out.println(l.contains(p4)); //false
		System.out.println(l.contains(p3)); //true 
		System.out.println(l.contains(null)); //false
		
		System.out.println(l.nbPoints());
		
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2); 
		//c2.translate(1,1); // erreur
		c2.translate(p, 1);
		System.out.println(c+" "+c2);

		Circle circle = new Circle(new Point(8,8),9);
		circle.getCenterPoint().translate(2, 2);
		System.out.println(circle);
		
		
		Point pring = new Point(2,7);
		Ring ring = new Ring(pring,1,2);
		System.out.println(ring);
		
		
		
	}

}
