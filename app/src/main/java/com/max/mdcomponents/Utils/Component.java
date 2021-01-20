package com.max.mdcomponents.Utils;

import java.util.Objects;

public class Component
{
    private String name;
    private int photRes;
    private int type;

    public Component(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhotRes() {
        return photRes;
    }

    public void setPhotRes(int photRes) {
        this.photRes = photRes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return photRes == component.photRes &&
                type == component.type &&
                Objects.equals(name, component.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, photRes, type);
    }
}
