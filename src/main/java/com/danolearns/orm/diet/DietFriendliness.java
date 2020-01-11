package com.danolearns.orm.diet;

import javax.persistence.*;
import java.util.List;

//@entity
public class DietFriendliness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int dietFriendlinessID;
    private String dietFriendliness;
    @ManyToMany(mappedBy="diet")
    private List<Diet> diets;

    @Override
    public String toString() {
        return "DietFriendliness{" +
                "dietFriendlinessID=" + dietFriendlinessID +
                ", dietFriendliness='" + dietFriendliness + '\'' +
                ", diets=" + diets +
                '}';
    }
}
