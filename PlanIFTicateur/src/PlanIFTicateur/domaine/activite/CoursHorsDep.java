/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur.domaine.activite;

import java.awt.Color;

/**
 *
 * @author Alexandre
 */
public class CoursHorsDep extends Activite {

    private Color couleur;
    private String type;

    public CoursHorsDep(String code, String section, String titre, String professeur, String type, double duree, double heureDebutMin, double heureDebutMax, double heureFinMax, int jour, double heureDebut) {
        super(code, section, titre, professeur, type, duree, heureDebutMin, heureDebutMax, heureFinMax, jour, heureDebut);
        this.type = "CoursHorsDep";
        this.couleur = Color.GRAY;
    }

    public Color getCouleur() {
        return couleur;
    }

    public String getType() {
        return type;
    }
}
