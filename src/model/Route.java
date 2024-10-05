package model;

public class Route {
    private int numberParticipants, numberGuides, numBuses;
    private double humedity, temperature;
    private String typeRoute;

    public Route(double humedity, int numBuses, int numberGuides, int numberParticipants, double temperature, String typeRoute) {
        this.humedity = humedity;
        this.numBuses = numBuses;
        this.numberGuides = numberGuides;
        this.numberParticipants = numberParticipants;
        this.temperature = temperature;
        this.typeRoute = typeRoute;
    }

    public int getNumberParticipants() {
        return numberParticipants;
    }
    public void setNumberParticipants(int numberParticipants) {
        this.numberParticipants = numberParticipants;
    }
    public int getNumberGuides() {
        return numberGuides;
    }
    public void setNumberGuides(int numberGuides) {
        this.numberGuides = numberGuides;
    }
    public int getNumBuses() {
        return numBuses;
    }
    public void setNumBuses(int numBuses) {
        this.numBuses = numBuses;
    }
    public double getHumedity() {
        return humedity;
    }
    public void setHumedity(double humedity) {
        this.humedity = humedity;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public String getTypeRoute() {
        return typeRoute;
    }
    public void setTypeRoute(String typeRoute) {
        this.typeRoute = typeRoute;
    }

}