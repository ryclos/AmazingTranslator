package com.exercice.translator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSLATEFRENCH")
public class TranslateFrenchEntity {

    @Id
    @Column(name = "NOMBREPOURTRAD", nullable = false)
    private int nombrePourTrad;
    
    @Column(name = "NOMBREENLETTRE", nullable = false)
    private String nombreEnLettre;

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
        return "TranslateAsset{" +
                "nombreEnLettre='" + nombreEnLettre + '\'' +
                ", nombrePourTrad=" + nombrePourTrad +
                '}';
    }
}
