package com.danolearns.orm.diet;

import javax.persistence.*;

//@entity
@Table(name="dietType")
public class DietType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int dietTypeId;
    private String dietType;

    public int getDietTypeId() {
        return dietTypeId;
    }

    public void setDietTypeId(int dietTypeId) {
        this.dietTypeId = dietTypeId;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "DietType{" +
                "dietTypeId=" + dietTypeId +
                ", dietType='" + dietType + '\'' +
                '}';
    }
}
