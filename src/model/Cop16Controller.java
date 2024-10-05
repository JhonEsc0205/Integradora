package model;

public class Cop16Controller {

    private PlaceBiodiverse[] places = new PlaceBiodiverse[30]; // Arreglo de 30 lugares biodiversos
    private User user = new User(null, null);
    private Route route = new Route(0, 0, 0, 0, 0, null);

    public Cop16Controller() {
    }

    public String newUser(String userName, String userId){
        String mssg = "Se ha realizado el registro";
        User addUser = new User(userName, userId);
        return mssg;
    }

    public void newSpecie(String specieName, String typeSpecie, int numberSpecie, String photoSpecie/*, String placeName*/){
        
        for (int i = 0; i < places.length; i++){
            //if(places[i].getPlaceName().equals(placeName)){
                places[i].addSpecie(specieName, typeSpecie, numberSpecie, photoSpecie);
                break;
        //}
            
        }
        
    }
    public void newComunity(String nameComunity, String typeRace, int numberHabitants, String mainProblems){
        for (int i = 0; i < places.length; i++){

            places[i].addComunity( nameComunity, typeRace, numberHabitants, mainProblems);

        }
    }
    public String addPlace(String placeName, String placeDeparment, double placeKm, String placePhoto, String placeOpening) {
        PlaceBiodiverse place = new PlaceBiodiverse(placeDeparment, placeKm, placeName, placePhoto, placeOpening);
        String msj = "No se pueden registrar más lugares biodiversos."; // Mensaje predeterminado
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                places[i] = place; 
                msj = "Lugar biodiverso registrado exitosamente.";
                break; // Salimos una vez que el lugar ha sido añadido
            }
        }
        return msj;
    }

    public PlaceBiodiverse[] getPlaces() {
        return places;
    }

    public void setPlaces(PlaceBiodiverse[] places) {
        this.places = places;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}