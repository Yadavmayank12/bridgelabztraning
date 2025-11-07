package src;

interface LightAction {
    void turnOn();
}

 class SmartLight {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion!");
        LightAction evening = () -> System.out.println("Soft warm lights ON at evening!");
        LightAction voice = () -> System.out.println("Voice command activated: Lights ON!");

        motion.turnOn();
        evening.turnOn();
        voice.turnOn();
    }
}