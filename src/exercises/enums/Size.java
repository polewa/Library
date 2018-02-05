package exercises.enums;

public enum Size {
    SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private String description;

    Size (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
