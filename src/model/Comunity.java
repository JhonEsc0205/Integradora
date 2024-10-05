package model;

public class Comunity {
    private String nameComunity, typeRace, mainProblems;
    private int numberHabitants;
    private Deputy deputy = new Deputy(nameComunity, mainProblems);


    public String newDeputy(String deputyName, String deputyNumber){
        String msg = "Se ha realizado el registro";
        Deputy addDeputy = new Deputy(deputyName, deputyNumber);
        return msg;
    }
    public Comunity(String nameComunity, String typeRace, int numberHabitants, String mainProblems) {
        this.nameComunity = nameComunity;
        this.typeRace = typeRace;
        this.mainProblems = mainProblems;
        this.numberHabitants = numberHabitants;
    }

    public String getNameComunity() {
        return nameComunity;
    }

    public void setNameComunity(String nameComunity) {
        this.nameComunity = nameComunity;
    }

    public String getTypeRace() {
        return typeRace;
    }

    public void setTypeRace(String typeRace) {
        this.typeRace = typeRace;
    }

    public int getNumberHabitants() {
        return numberHabitants;
    }

    public void setNumberHabitants(int numberHabitants) {
        this.numberHabitants = numberHabitants;
    }

    public String getMainProblems() {
        return mainProblems;
    }

    public void setMainProblems(String mainProblems) {
        this.mainProblems = mainProblems;
    }
    public Deputy getDeputy() {
        return deputy;
    }
    public void setDeputy(Deputy deputy) {
        this.deputy = deputy;
    }

}
