package com.danolearns.orm.diet;

import javax.persistence.*;
import java.util.List;

//Todo optimize with fetch type
//////@entity
@Table(name="diet")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int dietID;
    private String dietName;
    private String dietDescription;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dietTypeId")
    private DietType dietType;
    private String dietPicture;
    @ManyToMany
    private List<DietFriendliness> dietFriendlinesses;
    //TODO many to many with joint table
    @OneToMany(mappedBy="diet")
    private List<DietDietDay> days;

    public int getDietID() {
        return dietID;
    }

    public void setDietID(int dietID) {
        this.dietID = dietID;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName;
    }

    public String getDietDescription() {
        return dietDescription;
    }

    public void setDietDescription(String dietDescription) {
        this.dietDescription = dietDescription;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    public String getDietPicture() {
        return dietPicture;
    }

    public void setDietPicture(String dietPicture) {
        this.dietPicture = dietPicture;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "dietID=" + dietID +
                ", dietName='" + dietName + '\'' +
                ", dietDescription='" + dietDescription + '\'' +
                ", dietType=" + dietType +
                ", dietPicture='" + dietPicture + '\'' +
                ", dietFriendlinesses=" + dietFriendlinesses +
                ", days=" + days +
                '}';
    }
}
