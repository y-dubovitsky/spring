package space.dubovitsky.impls.car;

import space.dubovitsky.interfaces.Body;
import space.dubovitsky.interfaces.Car;
import space.dubovitsky.interfaces.Color;
import space.dubovitsky.interfaces.Number;

public class LadaCar implements Car {

    private Body body;
    private Color color;
    private Number number;

    private int count;
    private String owner;

    public LadaCar() {
    }

    public LadaCar(int count, String owner) {
        this.count = count;
        this.owner = owner;
    }

    public LadaCar(Body body, Color color, Number number, int count, String owner) {
        this.body = body;
        this.color = color;
        this.number = number;
        this.count = count;
        this.owner = owner;
    }

    @Override
    public void drive() {
        body.printBody();
        color.printColor();
        number.printNumber();
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
