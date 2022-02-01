package ru.shonin.javawebtomcat;

public enum TableFields {
    USER_TABLE ("users"),

    USERS_ID ("id"),
    USERS_NAME ("name"),
    USERS_SURNAME ("surname"),
    USERS_EMAIL ("email"),
    USERS_PASSWORD ("password"),
    USERS_BIRTHDAY ("birthday");



    private final String parametr;

    TableFields(String parametr) {
        this.parametr = parametr;
    }

    public String getParametr() {
        return parametr;
    }
}
