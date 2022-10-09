package racingcar.domain;

public class Winner {

    private final String name; // FIXME car와 Name을 같이 사용할 수 있도록 Name

    public Winner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
