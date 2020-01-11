package com.danolearns.orm.user;

import com.danolearns.orm.diet.Diet;

import javax.persistence.*;
import java.util.Date;
//@entity
@Table(name="userDiet")
public class UserDiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int userDietId;
    @OneToOne
    @JoinColumn(name = "dietId")
    private Diet diet;
    @OneToOne
    @JoinColumn(name = "userId")
    private UserProfile userProfile;
    private Date startDate;
    private Date endDate;

    public int getUserDietId() {
        return userDietId;
    }

    public void setUserDietId(int userDietId) {
        this.userDietId = userDietId;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "UserDiet{" +
                "userDietId=" + userDietId +
                ", diet=" + diet +
                ", userProfile=" + userProfile +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
