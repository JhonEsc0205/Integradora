package model;

public class Species {
    private String specieName, typeSpecie, photoSpecie;
    private int numberSpecie;

    public Species(String specieName, String typeSpecie, int numberSpecie, String photoSpecie) {
        this.numberSpecie = numberSpecie;
        this.specieName = specieName;
        this.typeSpecie = typeSpecie;
        this.photoSpecie = photoSpecie;
        
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public String getTypeSpecie() {
        return typeSpecie;
    }

    public void setTypeSpecie(String typeSpecie) {
        this.typeSpecie = typeSpecie;
    }

    public int getNumberSpecie() {
        return numberSpecie;
    }

    public void setNumberSpecie(int numberSpecie) {
        this.numberSpecie = numberSpecie;
    }

    public String getPhotoSpecie() {
        return photoSpecie;
    }

    public void setPhotoSpecie(String photoSpecie) {
        this.photoSpecie = photoSpecie;
    }

}
