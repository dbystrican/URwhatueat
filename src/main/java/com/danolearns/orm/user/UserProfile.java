package com.danolearns.orm.user;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

//@entity
@Table(name="userProfile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int userId;
    private String userName;
    private String email;
    private Date joined;
    @OneToMany
    List<UserDiet> userDiets;
    @OneToMany
    List<UserDailyRecords> userDailyRecords;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", joined=" + joined +
                ", userDiets=" + userDiets +
                ", userDailyRecords=" + userDailyRecords +
                '}';
    }
}
