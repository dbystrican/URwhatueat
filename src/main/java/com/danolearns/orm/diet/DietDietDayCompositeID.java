package com.danolearns.orm.diet;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DietDietDayCompositeID implements Serializable {
    private int dietId;
    private int dietDayId;

    public int getDietId() {
        return dietId;
    }

    public void setDietId(int dietId) {
        this.dietId = dietId;
    }

    public int getDietDayId() {
        return dietDayId;
    }

    public void setDietDayId(int dietDayId) {
        this.dietDayId = dietDayId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDietId(),getDietDayId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DietDietDayCompositeID)) return false;
        DietDietDayCompositeID that = (DietDietDayCompositeID) obj;
        return Objects.equals(getDietId(), that.getDietId()) &&
                Objects.equals(getDietDayId(), that.getDietDayId());
    }

    @Override
    public String toString() {
        return "DietDietDayCompositeID{" +
                "dietId=" + dietId +
                ", dietDayId=" + dietDayId +
                '}';
    }
}
