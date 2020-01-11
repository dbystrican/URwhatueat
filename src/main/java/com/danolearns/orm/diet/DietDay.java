package com.danolearns.orm.diet;

import javax.persistence.*;
import java.util.List;

//@entity
@Table(name="dietName")
public class DietDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int dietDayId;
    private String dayName;
    private String breakfest;
    private String breakfestDescription;
    private String snack;
    private String snackDescription;
    private String lunch;
    private String lunchDescription;
    private String teaTime;
    private String teaTimeDescription;
    private String dinner;
    private String dinnerDescription;
    //@ManyToMany(mappedBy="")
    @OneToMany(mappedBy="dietDay")
    private List<DietDietDay> days;

    public int getDietDayId() {
        return dietDayId;
    }

    public void setDietDayId(int dietDayId) {
        this.dietDayId = dietDayId;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getBreakfest() {
        return breakfest;
    }

    public void setBreakfest(String breakfest) {
        this.breakfest = breakfest;
    }

    public String getBreakfestDescription() {
        return breakfestDescription;
    }

    public void setBreakfestDescription(String breakfestDescription) {
        this.breakfestDescription = breakfestDescription;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getSnackDescription() {
        return snackDescription;
    }

    public void setSnackDescription(String snackDescription) {
        this.snackDescription = snackDescription;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getLunchDescription() {
        return lunchDescription;
    }

    public void setLunchDescription(String lunchDescription) {
        this.lunchDescription = lunchDescription;
    }

    public String getTeaTime() {
        return teaTime;
    }

    public void setTeaTime(String teaTime) {
        this.teaTime = teaTime;
    }

    public String getTeaTimeDescription() {
        return teaTimeDescription;
    }

    public void setTeaTimeDescription(String teaTimeDescription) {
        this.teaTimeDescription = teaTimeDescription;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getDinnerDescription() {
        return dinnerDescription;
    }

    public void setDinnerDescription(String dinnerDescription) {
        this.dinnerDescription = dinnerDescription;
    }

    @Override
    public String toString() {
        return "DietDay{" +
                "dietDayId=" + dietDayId +
                ", dayName='" + dayName + '\'' +
                ", breakfest='" + breakfest + '\'' +
                ", breakfestDescription='" + breakfestDescription + '\'' +
                ", snack='" + snack + '\'' +
                ", snackDescription='" + snackDescription + '\'' +
                ", lunch='" + lunch + '\'' +
                ", lunchDescription='" + lunchDescription + '\'' +
                ", teaTime='" + teaTime + '\'' +
                ", teaTimeDescription='" + teaTimeDescription + '\'' +
                ", dinner='" + dinner + '\'' +
                ", dinnerDescription='" + dinnerDescription + '\'' +
                ", days=" + days +
                '}';
    }
}
