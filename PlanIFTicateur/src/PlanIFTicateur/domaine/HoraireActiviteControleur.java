/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur.domaine;

import PlanIFTicateur.domaine.activite.Activite;
import PlanIFTicateur.domaine.fichier.GestionnaireFichier;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class HoraireActiviteControleur {

    private Horaire horaire;

    public enum ActiviteModes {

        CoursClasse, CoursDistance, CoursHorsDep, Laboratoire
    }

    public HoraireActiviteControleur(Horaire horaire) {
        this.horaire = horaire;
    }

    public HoraireActiviteControleur() {
        horaire = new Horaire();
    }

    public void deplacerActivite(int idActivite, Point mousePoint) {

    }

    public List<Activite> getActiviteListe() {
        return horaire.getListeActivite().getListeActivites();
    }

    public int getNombreActivite() {
        return horaire.getListeActivite().getListeActivites().size();
    }

    public void importerFichiers(String path) {
        GestionnaireFichier gestionnaireFichier = new GestionnaireFichier(path);
        ListeActivites listeActivites = gestionnaireFichier.getListeActivites();
        ListeGrillesCheminement listeGrillesCheminement = gestionnaireFichier.getGrillesCheminement(listeActivites);
        horaire.setListeActivite(listeActivites);
        horaire.setGrillesCheminement(listeGrillesCheminement);
    }

}
