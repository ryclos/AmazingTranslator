package com.exercice.translator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSLATEGERMAN")
public class TranslateGermanEntity {

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

    @Override
    public String toString() {
        return "TranslateGermanEntity{" +
                "nombrePourTrad=" + nombrePourTrad +
                ", nombreEnLettre='" + nombreEnLettre + '\'' +
                '}';
    }
}
