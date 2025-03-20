interface Device {
    void on();
    void off();
}

interface Mechanism {
    void Move();
}

interface Computer {
    void boot();
}

class Robot implements Device, Mechanism, Computer {
    public void on() {
        System.out.println("Robot is turning on.");
    }

    public void off() {
        System.out.println("Robot is turning off.");
    }

    public void Move() {
        System.out.println("Robot is moving.");
    }

    public void boot() {
        System.out.println("Robot is booting up.");
    }
}
