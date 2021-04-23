package com.example.pattern.prototype;

import java.util.Objects;

public abstract class Shape {

    protected float height;
    protected float width;
    protected String color;

    public Shape() {
    }

    // step 3
    public Shape(Shape obj) {
        if(Objects.nonNull(obj)) {
            this.height = obj.height;
            this.width = obj.width;
            this.color = obj.color;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) obj;
        return shape.color.equals(this.color) && shape.height == this.height && shape.width == this.width;
    }
}
