package main.java.temperatureConverter;


public enum TempUnit {
    CELSIUS("Цельсия"),
    FAHRENHEIT("Фаренгейта"),
    KELVIN("Кельвина");

    private final String unitName;

    TempUnit(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }
}
