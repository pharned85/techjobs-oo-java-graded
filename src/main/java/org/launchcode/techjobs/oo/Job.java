//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return this.positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return this.coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        String fieldEntry;
        if (!this.getName().equals("") && this.getName() != null) {
            int var10000 = this.getId();
            fieldEntry = "\nID: " + var10000 + "\nName: " + this.getName();
        } else {
            fieldEntry = "\nID: " + this.getId() + "\nName: Data not available";
        }

        if (!this.employer.getValue().equals("") && this.employer.getValue() != null) {
            fieldEntry = fieldEntry + "\nEmployer: " + this.getEmployer();
        } else {
            fieldEntry = fieldEntry + "\nEmployer: Data not available";
        }

        if (!this.location.getValue().equals("") && this.location.getValue() != null) {
            fieldEntry = fieldEntry + "\nLocation: " + this.getLocation();
        } else {
            fieldEntry = fieldEntry + "\nLocation: Data not available";
        }

        if (!this.positionType.getValue().equals("") && this.positionType.getValue() != null) {
            fieldEntry = fieldEntry + "\nPosition Type: " + this.getPositionType();
        } else {
            fieldEntry = fieldEntry + "\nPosition Type: Data not available";
        }

        if (!this.coreCompetency.getValue().equals("") && this.coreCompetency.getValue() != null) {
            fieldEntry = fieldEntry + "\nCore Competency: " + this.getCoreCompetency() + "\n";
        } else {
            fieldEntry = fieldEntry + "\nCore Competency: Data not available\n";
        }

        return fieldEntry;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Job)) {
            return false;
        } else {
            Job job = (Job)o;
            return this.getId() == job.getId();
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getId()});
    }
}
