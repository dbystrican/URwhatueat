package com.danolearns.orm.user;

import javax.persistence.*;

//@entity
@Table(name = "googleLogin")
public class GoogleLogin {
    @OneToOne
    @JoinColumn(name = "userId")
    private UserProfile userProfile;
    private String token;



    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
