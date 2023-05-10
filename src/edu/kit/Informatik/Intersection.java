package edu.kit.Informatik;

public class Intersection {
    private TrafficLight[] trafficLights;

    public Intersection() {
        trafficLights = new TrafficLight[3];
        for (int i = 0; i < trafficLights.length; i++) {
            trafficLights[i] = new TrafficLight();

        }
    }
    public boolean isSafe(int index) {


        return this.trafficLights[index - 1].isGreen();
    }

}