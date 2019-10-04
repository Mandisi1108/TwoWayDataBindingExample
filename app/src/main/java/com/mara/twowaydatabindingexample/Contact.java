package com.mara.twowaydatabindingexample;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.mara.twowaydatabindingexample.BR;

public class Contact extends BaseObservable {
    private int id;
    private String name, email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public int getId() {
        return id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}
