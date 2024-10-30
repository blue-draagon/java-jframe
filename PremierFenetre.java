import javax.swing.JFrame ;

public class PremierFenetre {

	public static void main (String []args) {

		System.out.println("Debut de la méthode main");

		JFrame fenetre_1 = new JFrame();

		fenetre_1.setTitle("Ma Première Fenêtre") ;

		fenetre_1.setSize(400, 400) ;

		fenetre_1.setVisible(true) ;

		System.out.println("Fin de la méthode main");

	}

}
