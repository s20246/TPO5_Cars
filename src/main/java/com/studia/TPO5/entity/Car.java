package com.studia.TPO5.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue
    @Column
    int id;
    @Column
    String rodzaj;
    @Column
    String marka;
    @Column
    int rokProdukcji;
    @Column
    double zużyciePaliwa;

    public Car(String rodzaj, String marka, int rokProdukcji, double zużyciePaliwa) {
        this.rodzaj = rodzaj;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.zużyciePaliwa = zużyciePaliwa;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", rodzaj='" + rodzaj + '\'' +
                ", marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", zużyciePaliwa=" + zużyciePaliwa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return id == car.id && rokProdukcji == car.rokProdukcji && Double.compare(car.zużyciePaliwa, zużyciePaliwa) == 0 && Objects.equals(rodzaj, car.rodzaj) && Objects.equals(marka, car.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rodzaj, marka, rokProdukcji, zużyciePaliwa);
    }
}

