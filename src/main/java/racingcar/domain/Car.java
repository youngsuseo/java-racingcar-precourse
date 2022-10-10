package racingcar.domain;

public class Car {

    private final Name name;
    private final String position;

    public Car(String name, String postion) {
        this.name = new Name(name);
        this.position = postion;
    }
}
