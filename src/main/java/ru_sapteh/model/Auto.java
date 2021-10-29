package ru_sapteh.model;

import java.util.Objects;

public class Auto {
    private int id;
    private String model;
    private String mark;
    private String body_type;
    private String type_gasoline;

    public Auto() {

    }

    public Auto(int id, String model, String mark, String body_type, String type_gasoline) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.body_type = body_type;
        this.type_gasoline = type_gasoline;
    }

    public Auto(String model, String mark, String body_type, String type_gasoline) {
        this.model = model;
        this.mark = mark;
        this.body_type = body_type;
        this.type_gasoline= type_gasoline;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getBody_type() {
        return body_type;
    }

    public String getType_gasoline() {
        return type_gasoline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public void setType_gasoline(String type_gasoline) {
        this.type_gasoline = type_gasoline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id && Objects.equals(model, auto.model) && Objects.equals(mark, auto.mark) && Objects.equals(body_type, auto.body_type) && Objects.equals(type_gasoline, auto.type_gasoline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, mark, body_type, type_gasoline);

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", body_type='" + body_type + '\'' +
                ", type_gasoline='" + type_gasoline + '\'' +
                '}';
    }
}
