package org.lab5.homework;

import java.net.URI;
import java.util.UUID;

public class Document {
    private String id = UUID.randomUUID().toString();
    private String name;
    private LocationType type;
    private String path;

    public Document() {
    }

    public Document(String name, LocationType type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", path='" + path + '\'' +
                '}';
    }
}
