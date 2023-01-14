package com.example.surfacegeneration.UI;

public class Logic {
    private float x,y,z,radius;

    public Logic(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getCoordinates(){
        return new float[]{x,y,z};
    }
    public void update(int newX,int newY){

    }
}
