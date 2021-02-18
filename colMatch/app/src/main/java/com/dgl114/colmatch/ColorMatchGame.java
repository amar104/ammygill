package com.dgl114.colmatch;

import android.graphics.Color;

public class ColorMatchGame {
    public static Color colorMatch(Color col1 , Color col2){
        Color targetColor;
        targetColor=ColorUtilities.blend(col1, col2);
        return targetColor;
    }
}
