package adresse;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdresse {

	public static void main(String[] args) {
		//déclaration d'un liste d'adresse
		List<String> adress = new ArrayList<String>();
		
		//ajouter des adresse dans la liste
		adress.add("Thies");
		adress.add("Dakar");
		adress.add("Diourbel");
		
		//affichage des addresse en utilisant les expression lambda
		adress.forEach(n->System.out.println(n));
	}
}
