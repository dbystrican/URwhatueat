package com.danolearns.orm.user;

import com.danolearns.orm.diet.Diet;
import com.danolearns.orm.diet.DietDay;

import javax.persistence.*;
import java.util.Date;
//@entity
@Table(name = "userDailyRecords")
public class UserDailyRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    int userdailyRecordID;
    @ManyToOne
    UserProfile userProfile;
    Date date;
    Diet diet;
    DietDay dietDay;
    String breakfestNote;
    String breakfestTime;
    boolean breakfestSuccess;
    String snackNote;
    String snackTime;
    boolean snackSuccess;
    String lunchNote;
    String lunchTime;
    boolean lunchSuccess;
    String teaTimeNote;
    String teaTimeTime;
    boolean teaTimeSuccess;
    String dinnerNote;
    String dinnerTime;
    boolean dinnerSuccess;

    public int getUserdailyRecordID() {
        return userdailyRecordID;
    }

    public void setUserdailyRecordID(int userdailyRecordID) {
        this.userdailyRecordID = userdailyRecordID;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public DietDay getDietDay() {
        return dietDay;
    }

    public void setDietDay(DietDay dietDay) {
        this.dietDay = dietDay;
    }

    public String getBreakfestNote() {
        return breakfestNote;
    }

    public void setBreakfestNote(String breakfestNote) {
        this.breakfestNote = breakfestNote;
    }

    public String getBreakfestTime() {
        return breakfestTime;
    }

    public void setBreakfestTime(String breakfestTime) {
        this.breakfestTime = breakfestTime;
    }

    public boolean isBreakfestSuccess() {
        return breakfestSuccess;
    }

    public void setBreakfestSuccess(boolean breakfestSuccess) {
        this.breakfestSuccess = breakfestSuccess;
    }

    public String getSnackNote() {
        return snackNote;
    }

    public void setSnackNote(String snackNote) {
        this.snackNote = snackNote;
    }

    public String getSnackTime() {
        return snackTime;
    }

    public void setSnackTime(String snackTime) {
        this.snackTime = snackTime;
    }

    public boolean isSnackSuccess() {
        return snackSuccess;
    }

    public void setSnackSuccess(boolean snackSuccess) {
        this.snackSuccess = snackSuccess;
    }

    public String getLunchNote() {
        return lunchNote;
    }

    public void setLunchNote(String lunchNote) {
        this.lunchNote = lunchNote;
    }

    public String getLunchTime() {
        return lunchTime;
    }

    public void setLunchTime(String lunchTime) {
        this.lunchTime = lunchTime;
    }

    public boolean isLunchSuccess() {
        return lunchSuccess;
    }

    public void setLunchSuccess(boolean lunchSuccess) {
        this.lunchSuccess = lunchSuccess;
    }

    public String getTeaTimeNote() {
        return teaTimeNote;
    }

    public void setTeaTimeNote(String teaTimeNote) {
        this.teaTimeNote = teaTimeNote;
    }

    public String getTeaTimeTime() {
        return teaTimeTime;
    }

    public void setTeaTimeTime(String teaTimeTime) {
        this.teaTimeTime = teaTimeTime;
    }

    public boolean isTeaTimeSuccess() {
        return teaTimeSuccess;
    }

    public void setTeaTimeSuccess(boolean teaTimeSuccess) {
        this.teaTimeSuccess = teaTimeSuccess;
    }

    public String getDinnerNote() {
        return dinnerNote;
    }

    public void setDinnerNote(String dinnerNote) {
        this.dinnerNote = dinnerNote;
    }

    public String getDinnerTime() {
        return dinnerTime;
    }

    public void setDinnerTime(String dinnerTime) {
        this.dinnerTime = dinnerTime;
    }

    public boolean isDinnerSuccess() {
        return dinnerSuccess;
    }

    public void setDinnerSuccess(boolean dinnerSuccess) {
        this.dinnerSuccess = dinnerSuccess;
    }

    @Override
    public String toString() {
        return "UserDailyRecords{" +
                "userdailyRecordID=" + userdailyRecordID +
                ", userProfile=" + userProfile +
                ", date=" + date +
                ", diet=" + diet +
                ", dietDay=" + dietDay +
                ", breakfestNote='" + breakfestNote + '\'' +
                ", breakfestTime='" + breakfestTime + '\'' +
                ", breakfestSuccess=" + breakfestSuccess +
                ", snackNote='" + snackNote + '\'' +
                ", snackTime='" + snackTime + '\'' +
                ", snackSuccess=" + snackSuccess +
                ", lunchNote='" + lunchNote + '\'' +
                ", lunchTime='" + lunchTime + '\'' +
                ", lunchSuccess=" + lunchSuccess +
                ", teaTimeNote='" + teaTimeNote + '\'' +
                ", teaTimeTime='" + teaTimeTime + '\'' +
                ", teaTimeSuccess=" + teaTimeSuccess +
                ", dinnerNote='" + dinnerNote + '\'' +
                ", dinnerTime='" + dinnerTime + '\'' +
                ", dinnerSuccess=" + dinnerSuccess +
                '}';
    }
}
