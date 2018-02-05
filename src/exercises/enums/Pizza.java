package exercises.enums;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private boolean sosPomidorowy, ser, pieczarki, szynka;

    Pizza(boolean sosPomidorowy, boolean ser, boolean pieczarki, boolean szynka) {
        this.sosPomidorowy = sosPomidorowy;
        this.ser = ser;
        this.pieczarki = pieczarki;
        this.szynka = szynka;
    }

    public boolean isSosPomidorowy() {
        return sosPomidorowy;
    }

    public boolean isSer() {
        return ser;
    }

    public boolean isPieczarki() {
        return pieczarki;
    }

    public boolean isSzynka() {
        return szynka;
    }

    @Override
    public String toString() {
        String result = this.name();
        if(isSosPomidorowy()) result += ": sos pomidorowy";
        if(isSer()) result += ", ser";
        if(isPieczarki()) result += ", pieczarki";
        if(isSzynka()) result += ", szynka.";
        return result;
    }
}
