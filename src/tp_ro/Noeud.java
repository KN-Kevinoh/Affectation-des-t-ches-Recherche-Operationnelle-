/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_ro;

/**
 *
 * @author Fabien KAMBU
 */
import java.util.ArrayList;

public class Noeud {
	
	private int labelNoeud;
	private int Nombresvoisins;
	private ArrayList<Noeud> successeurs;
	
	// constructeurs  classes
	public Noeud(int labNoeud)
	{
		this.labelNoeud=labNoeud;
	}
	
	public int getLabelNoeud() {
		return this.labelNoeud;
	}
	
	//Getters pour recuperer les nombres des successeurs
	public int getNbresSuccesseurs() {
		return successeurs.size();
	}
	//Setters pour Ajouter un Noeud voisin au Noeud
	public void SetNoeudSuccesseur(Noeud noeudS) {
		this.successeurs.add(noeudS);
	}
	
	//Getters pour recuperer le nombres des voisins
	public int getNombresvoisins() {
		return this.Nombresvoisins;
	}
	//Setters pour gerer le nombres des voisins
	public void setNombresvoisins(int nombresvoisin) {
		this.Nombresvoisins = nombresvoisin;
	}
	
}

