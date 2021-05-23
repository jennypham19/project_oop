package project;

public class Main {

	public static void main(String[] args) {
		ScienceMagazine SM = new ScienceMagazine(0, null,0);
		SM.display();
		TextBook TB = new TextBook(0, 0,0, null, null);
		TB.display();
		ReferenceBook RB = new ReferenceBook(0, 0, null, null,0, 0);
		RB.display();
	}

}
