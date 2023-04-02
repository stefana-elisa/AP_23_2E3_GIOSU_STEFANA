package org.lab5.compulsory;

public class InvalidCatalogException extends Exception {
    public InvalidCatalogException(Exception ex) {
        super("Catalog file is invalid", ex);
    }
}
