package com.example.anggiat.wondersoftheworld;

import android.os.Parcel;
import android.os.Parcelable;

public class Object implements Parcelable {

    private String name;
    private String detail;
    private String country;
    private String photo;
    private String coordinate;
    private String rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeString(this.country);
        dest.writeString(this.photo);
        dest.writeString(this.coordinate);
        dest.writeString(this.rate);
    }

    public Object() {
    }

    private Object(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.country = in.readString();
        this.photo = in.readString();
        this.coordinate = in.readString();
        this.rate = in.readString();
    }

    public static final Creator<Object> CREATOR = new Creator<Object>() {
        @Override
        public Object createFromParcel(Parcel source) {
            return new Object(source);
        }

        @Override
        public Object[] newArray(int size) {
            return new Object[size];
        }
    };
}
