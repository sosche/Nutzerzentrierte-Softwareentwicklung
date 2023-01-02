package com.example.git_foodtracker;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

@Entity
public class Produkt implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int pid;

    private String m_name;
    private int m_anzahl;
    private float m_gewicht;
    private String m_datum;


    @Ignore
    public Produkt(String name, int anzahl, float gewicht, String datum)
    {
        setM_name(name);
        setM_anzahl(anzahl);
        setM_gewicht(gewicht);
        setM_datum(datum);
    }

    public Produkt()
    {

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getM_anzahl() {
        return m_anzahl;
    }

    public void setM_anzahl(int m_anzahl) {
        this.m_anzahl = m_anzahl;
    }

    public float getM_gewicht() {
        return m_gewicht;
    }

    public void setM_gewicht(float m_gewicht) {
        this.m_gewicht = m_gewicht;
    }

    public String getM_datum() {
        return m_datum;
    }

    public void setM_datum(String m_datum) {
        this.m_datum = m_datum;
    }
}

