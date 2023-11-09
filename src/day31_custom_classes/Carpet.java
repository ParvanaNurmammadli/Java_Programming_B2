package day31_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet (boolean inputIsPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        width = inputWidth;
        length = inputLength;
        isPersian = inputIsPersian;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }

    public void calculatePrice () {
        totalPrice = width * length * unitPrice;

        if(isPersian) {
            totalPrice += 200;
        }

    }

    @Override
    public String toString() {
        return (isPersian ? "The Persian carpet " : "The carper") +
                "\n\tHas dimensions: " + width + " x " + length +
                "\n\tUnit Price $" + unitPrice +
                "\n\tTotal Price $" + totalPrice;

    }
}



