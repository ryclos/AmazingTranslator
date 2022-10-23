package com.pambrun.az.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSLATEGERMAN")
public class GermanTranslateEntity {

    @Id
    @Column(name = "NOMBREPOURTRAD", nullable = false)
    private int nombrePourTrad;

    @Column(nullable = false)
    private String nombreEnLettre;

    @Column(name = "LANG", nullable = false)
    private String langue;

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public int getNombrePourTrad() {
        return nombrePourTrad;
    }

    public void setNombrePourTrad(int nombrePourTrad) {
        this.nombrePourTrad = nombrePourTrad;
    }

    public String getNombreEnLettre() {
        return nombreEnLettre;
    }

    public void setNombreEnLettre(String nombreEnLettre) {
        this.nombreEnLettre = nombreEnLettre;
    }

    // Generer un toString pour le debug


    @Override
    public String toString() {
        return "EntityFrenchTranslate{" +
                "nombrePourTrad=" + nombrePourTrad +
                ", nombreEnLettre='" + nombreEnLettre + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }
}
