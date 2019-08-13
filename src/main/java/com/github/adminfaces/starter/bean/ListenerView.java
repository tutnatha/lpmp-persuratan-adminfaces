package com.github.adminfaces.starter.bean;

import javax.annotation.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class ListenerView implements Serializable {

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
}
