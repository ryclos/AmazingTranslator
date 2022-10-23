package com.pambrun.az.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRANSLATION")
public class TranslateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String lang;
    private int num;
    private String translation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "TranslateEntity{" +
                "id=" + id +
                ", lang='" + lang + '\'' +
                ", num=" + num +
                ", translation='" + translation + '\'' +
                '}';
    }
}
