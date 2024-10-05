package model;
public class PlaceBiodiverse {
    
    private String placeName, placeDeparment, placePhoto, placeOpening;
    private double placeKm;
    private Species[] species = new Species[50];
    private Comunity[] comunity = new Comunity[1];


    //PlaceBiodiverse place = new PlaceBiodiverse(placeDeparment, placeKm, placeName, placePhoto, placeOpening);
    
    public String addComunity(String nameComunity, String typeRace, int numberHabitants, String mainProblems){
        String msg = "Re registro exitosamente la comunidad";
        comunity[0] = new Comunity(nameComunity, typeRace , numberHabitants, mainProblems);
        return msg;
    }
    public String addSpecie(String specieName, String typeSpecie, int numberSpecie, String photoSpecie){
        String message = "No se puede realizar el registro";
        for(int i = 0; i < species.length; i++){
                if(species[i] == null){
                species[i] = new Species(specieName, typeSpecie, numberSpecie, photoSpecie);
                message = "Se ha realizado el registro exitosamente";
                break;
            }
        }
        return message;
    }

  public PlaceBiodiverse(String placeDeparment, double placeKm, String placeName, String placePhoto, String placeOpening) {
        this.placeDeparment = placeDeparment;
        this.placeKm = placeKm;
        this.placeName = placeName;
        this.placePhoto = placePhoto;
        this.placeOpening = placeOpening;
    }
    
    public String getPlaceOpening() {
    return placeOpening;
    }

    public void setPlaceOpening(String placeOpening) {
        this.placeOpening = placeOpening;
    }

    public String getPlacePhoto() {
        return placePhoto;
    }

    public void setPlacePhoto(String placePhoto) {
        this.placePhoto = placePhoto;
    }
  
    public String getPlaceName() {
        return placeName;
    }
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    public String getPlaceDeparment() {
        return placeDeparment;
    }
    public void setPlaceDeparment(String placeDeparment) {
        this.placeDeparment = placeDeparment;
    }
    public double getPlaceKm() {
        return placeKm;
    }
    public void setPlaceKm(double placeKm) {
        this.placeKm = placeKm;
    }

    public Species[] getSpecies() {
        return species;
    }

    public void setSpecies(Species[] species) {
        this.species = species;
    }
    public Comunity[] getComunity() {
        return comunity;
    }
    public void setComunity(Comunity[] comunity) {
        this.comunity = comunity;
    }

}