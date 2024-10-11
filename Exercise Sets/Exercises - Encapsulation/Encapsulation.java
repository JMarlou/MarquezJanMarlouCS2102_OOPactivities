public class Encapsulation {
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85 , 'm');
        System.out.println(car1.toString());
        
        Car car2 = new Car("blue", 50000.00, 'L');
        System.out.println(car2.toString());
    }
}

class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        setSize(size);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return Character.toUpperCase(size);
    }

    public void setSize(char size) {
        char upperSize = Character.toUpperCase(size);
        
        switch(upperSize){
            case 'S':
                this.size = 'S';
                break;
            case 'M':
                this.size = 'M';
                break;
            case 'L':
                this.size = 'L';
                break;
            default:
                System.out.println("Invalid size. Please enter S, M or L.");
                this.size = '-';
        }
    }

    @Override
    public String toString() {
        String formattedPrice = String.format("%.2f", price);

        String sizeDescriptor = "";
        switch (getSize()) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unknown size";
                break;
        }
        return "Car " + color + " - P(" + formattedPrice + ") - " + sizeDescriptor;
    }
}
