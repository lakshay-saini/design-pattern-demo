package com.example.pattern.prototype;

import java.util.Objects;

public class Rectangle extends Shape implements Cloneable{

    private float length;

    public Rectangle() {
    }

    // step 2
    public Rectangle(Rectangle obj) {
        super(obj);
        // step 4
        if(Objects.nonNull(obj)) {
            this.length = obj.length;
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    // step 1
    // calling the clone method and creating a new object using deep/shallow copy
    @Override
    public Object clone() {
        return new Rectangle(this);
    }
}
