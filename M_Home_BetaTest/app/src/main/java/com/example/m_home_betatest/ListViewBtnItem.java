package com.example.m_home_betatest;

import android.graphics.drawable.Drawable;

public class ListViewBtnItem {
    private Drawable iconDra;
    private  String textStr;

    public void setIcon(Drawable icon)
    {
        iconDra = icon;
    }

    public void setText(String text)
    {
        textStr = text;
    }

    public Drawable getIcon()
    {
        return this.iconDra;
    }

    public String getText()
    {
        return this.textStr;
    }
}
