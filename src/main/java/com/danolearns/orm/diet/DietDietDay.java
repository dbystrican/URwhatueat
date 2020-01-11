package com.danolearns.orm.diet;


import javax.persistence.*;

//ToDo make this class
//@entity
public class DietDietDay {
    @EmbeddedId
    private DietDietDayCompositeID dietDietDayId;
    private int dayinDietId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("dietId")
    private Diet diet;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("dietDayId")
    private DietDay dietDay;
    @Column(name="dayinDietId")
    private int dayInDietId;

    public DietDietDayCompositeID getDietDietDayId() {
        return dietDietDayId;
    }

    public void setDietDietDayId(DietDietDayCompositeID dietDietDayId) {
        this.dietDietDayId = dietDietDayId;
    }

    public int getDayinDietId() {
        return dayinDietId;
    }

    public void setDayinDietId(int dayinDietId) {
        this.dayinDietId = dayinDietId;
    }

    @Override
    public String toString() {
        return "DietDietDay{" +
                "dietDietDayId=" + dietDietDayId +
                ", dayinDietId=" + dayinDietId +
                ", diet=" + diet +
                ", dietDay=" + dietDay +
                ", dayInDietId=" + dayInDietId +
                '}';
    }
}
