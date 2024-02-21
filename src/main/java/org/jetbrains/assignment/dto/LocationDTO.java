package org.jetbrains.assignment.dto;

import java.io.Serializable;

public class LocationDTO implements Serializable {

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    private String direction;
    private Integer steps;
}
