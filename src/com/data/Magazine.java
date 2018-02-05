package com.data;

import java.time.LocalDate;

public class Magazine extends Publication {

    private static final long serialVersionUID = 2061400934707882806L;

    private String language;

    public int getMonth() {
        return getDate().getMonthValue();
    }
    public int getDay() {
        return getDate().getDayOfMonth();
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(year, title, publisher);
        setLanguage(language);
        setDate(LocalDate.of(year, month, day));
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder(32);
        print.append(getTitle());
        print.append("; ");
        print.append(getPublisher());
        print.append("; ");
        print.append(getYear());
        print.append("; ");
        print.append(getMonth());
        print.append("; ");
        print.append(getDay());
        print.append("; ");
        print.append(getLanguage());
        return print.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return language != null ? language.equals(magazine.language) : magazine.language == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
