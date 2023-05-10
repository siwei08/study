package edu.kit.Informatik;

public class TrafficLight {

    private boolean red;
    private boolean yellow;
    private boolean green;

    public TrafficLight(boolean initialRed, boolean initialYellow, boolean initialGreen) {
        this.red = initialRed;
        this.yellow = initialYellow;
        this.green = initialGreen;
    }

    public TrafficLight() {
        this.red = true;
        this.yellow = false;
        this.green = false;
    }

    public void toggle() {
        red = !red;
        yellow = !yellow;
        green = !green;
    }

    public boolean isRed() {
        return red;
    }
    public boolean isYellow() {
        return yellow;
    }

    public boolean isGreen() {
        return green;
    }
    public void changeLight() {
                if (red && !yellow && !green) {
                red = false;
                green = true;
                } else if (!red && !yellow && green) {
                yellow = true;
                green = false;
                } else if (!red && yellow && !green) {
                red = true;
                yellow = false;
                } else {
                yellow = true;
                red = false;
                }
    }
            public boolean isCurrentlyGreen() {
                return green;
            }

            public boolean isCurrentlyYellow() {
                return yellow;
            }

        }