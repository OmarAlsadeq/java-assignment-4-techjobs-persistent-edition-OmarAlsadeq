package org.launchcode.techjobs.persistent.models;

import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=300, message="Description must be 300 characters or less")
    public String description;

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}