package be.ifosupwavre.info.poo.recipe.pojo;

public class Ingredient {
    private String Name;
    private Unit unit;
    private float qty;

    private enum Unit{
        GRAMS("Grammes"),
        MILLILITERS("Millilitres"),
        PIECES("Pièces");

        Unit(String unit) {

        }
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public float getQty() {
        return qty;
    }
    public void setQty(float qty) {
        this.qty = qty;
    }
    public Unit getUnit() {
        return unit;
    }
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    public void poo(String bar, int val, float tmp){

    }
    public void poo(String bar){
        poo(bar, 2, 3f);
    }
}
