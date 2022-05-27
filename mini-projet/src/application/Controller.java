package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	
	
	@FXML
	public void ajouter() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println();
		int Matricule = Integer.parseInt(br.readLine());
		
		System.out.println();
		String Nom = br.readLine();
		
		System.out.println();
		double Recrutement = Double.parseDouble(br.readLine());
		
		System.out.println();
		String Email = br.readLine();
		
		System.out.println();
		double Hsupp = Double.parseDouble(br.readLine());
		
		
		System.out.println();
		double salaire = Double.parseDouble(br.readLine());
		
		
		System.out.println();
		double PHsupp = Double.parseDouble(br.readLine());
		
		
		System.out.println();
		String categorie = br.readLine();
		
		Employes x = new Employes( Recrutement,  Matricule, Nom,  Email,  salaire,  Hsupp,
				 PHsupp); 
				
		String req="insert into entreprise values ('"+x.getMatricule()+"',"
				+ "'"+x.getEmail()+"','"+x.getHsupp()+"','"+x.getNom()+"',"
						+ "'"+x.getRecrutement()+"','"+x.getPHsupp()+"','"+x.getSalaire()+"');";
		
		try {
			Statement st = connexion.getCon().createStatement();
			int nb = st.executeUpdate(req);
			System.out.println(nb + "inserer");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	TextField nom;
	
	
	@FXML
	TextField  sal;
	
	@FXML
	TextField  Rec;
	
	@FXML
	TextField  Hs;
	
	@FXML
	TextField  PHs;
	
	
	@FXML
	TextField  cat;
	
	@FXML
	TextField  em;
	
	@FXML
	TextField  mat;
	
	@FXML
	Button Ajout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
