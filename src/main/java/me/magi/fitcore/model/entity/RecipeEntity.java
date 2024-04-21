package me.magi.fitcore.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String title;

    private String bodyText;

    private Date registerDay;

    @OneToMany
    private List<ContentCreatorEntity> owner;

    private String calories;

    private List<String> ingrendients;

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

    public List<ContentCreatorEntity> getOwner() {
        return owner;
    }

    public void setOwner(List<ContentCreatorEntity> owner) {
        this.owner = owner;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public List<String> getIngrendients() {
        return ingrendients;
    }

    public void setIngrendients(List<String> ingrendients) {
        this.ingrendients = ingrendients;
    }
}
