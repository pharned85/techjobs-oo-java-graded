package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof JobField)) {
            return false;
        } else {
            JobField jobField = (JobField)o;
            return this.getId() == jobField.getId();
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public int getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
