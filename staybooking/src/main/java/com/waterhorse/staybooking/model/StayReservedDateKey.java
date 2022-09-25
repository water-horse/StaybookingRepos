package com.waterhorse.staybooking.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class StayReservedDateKey implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "stay_id")
    private Long stayId;
    private LocalDate date;

    public StayReservedDateKey() {}

    public StayReservedDateKey(Long stayId, LocalDate date) {
        this.stayId = stayId;
        this.date = date;
    }

    public void setStayId(Long stayId) {
        this.stayId = stayId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getStayId() {
        return stayId;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StayReservedDateKey that = (StayReservedDateKey) o;
        return Objects.equals(stayId, that.stayId) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stayId, date);
    }
}
