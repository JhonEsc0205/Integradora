package ui;
import java.util.*;
import model.Cop16Controller;

public class Cop16System {
    static  Cop16Controller controller = new Cop16Controller();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        System.out.println("Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali - Colombia.\nIngresa tu nombre:");
        String userName = sc.nextLine();
        System.out.println("Ingresa tu documento:");
        String userId = sc.nextLine();
        controller.newUser(userName, userId);
        System.out.println("Bienvenido " + userName + "!!!");
        //No le da la bienvenidad al usuario

        do{
            System.out.println("Seleccione una de las siguientes opciones:\n1. Seleccionar ruta\n2. Registrar Lugar Biodiverso\n3. Ordenas lugares biodiversos de menor a mayor respectu a su area\n4. Mostrar departamento con mas lugares biodiversos\n5. Mostrar lugar biodiverso con la mayor cantidad de especies\n6. Consultar comunidades con problemas por falta de escuela u hospital\n7. Modificar datos de especie\n8. Cerrar programa");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> {

                    break;
                }
                case 2 -> {

                    System.out.println("Ingrese el nombre del lugar biodiverso:");
                    sc.nextLine();
                    String placeName = sc.nextLine();
                    int depar;
                    String placeDeparment = "";
                    do{
                        System.out.println("Ingrese el departamento en el que esta ubicado el lugar:\n1. Cauca\n2. Valle\n3. Nariño\n4. Choco");
                        depar = sc.nextInt();
                        switch (depar) {
                            case 1 -> {
                                placeDeparment = "Cauca";
                                break;
                            }
                            case 2 -> {
                                placeDeparment = "Valle";
                                break;
                            }
                            case 3 -> {
                                placeDeparment = "Nariño";
                                break;
                            }
                            case 4 -> {
                                placeDeparment = "Choco";
                                break;
                            } 
                            default -> {
                                System.out.println("Opcion Incorrecta");
                                break;
                            }
                        }
                    } while(depar < 1 || depar > 4);
                    System.out.println("Ingrese el area del lugar:");
                    double placeKm = sc.nextDouble();  
                    System.out.println("Por favor agrega la URL de la foto del lugar");
                    sc.nextLine();
                    String placePhoto = sc.nextLine();
                    System.out.println("En que fecha fue inaugurado el lugar?: ");
                    //sc.nextLine();
                    String placeOpening = sc.nextLine();
                    controller.addPlace(placeName, placeDeparment, placeKm, placePhoto, placeOpening);
                    System.out.println("Cuantas especies tiene el lugar?:");
                    int quantitySpecies = sc.nextInt();
                    for(int i = 0; i < quantitySpecies; i++){
                        String typeSpecie;
                        System.out.println("Cual es el nombre de la especie?:");
                        String specieName = sc.nextLine();
                        System.out.println("Cual es el tipo de la especie?:\n1. Fauna\n2. Flora");
                        int type = sc.nextInt();
                        if(type == 1){
                            typeSpecie = "Fauna";
                        } else {
                            typeSpecie = "Flora";
                        }
                        System.out.println("Cual es la cantidad de ejemplares de la especie?: ");
                        int numberSpecie = sc.nextInt();
                        System.out.println("Por favor agrega la URL de la foto de la especie: ");
                        sc.nextLine();
                        String photoSpecie = sc.nextLine();
                        controller.newSpecie(specieName, typeSpecie, numberSpecie, photoSpecie/*, placeName*/);
                    }
                    System.out.println("Existe alguna comunidad que proteja el lugar?:\n1. Si\n2. No");
                    int exist = sc.nextInt();
                    String nameComunity;
                    String typeRace ="";
                    int numberHabitants;
                    String mainProblems ="";
                    if (exist == 1){
                        System.out.println("Cual es el nombre de la comunidad?: ");
                        sc.nextLine();
                        nameComunity = sc.nextLine();
                        int race = 0;
                        do{
                            System.out.println("Cual es la raza de la comunidad?: \n1. Afrocolombiana\n2. Indigena\n3. Raizal");
                            race = sc.nextInt();
                            switch(race){
                                case 1 -> {
                                    typeRace = "Afrocolombiana";
                                    break;
                                }
                                case 2 -> {
                                    typeRace = "Indigena";
                                    break;
                                }
                                case 3 -> {
                                    typeRace = "Raizal";
                                    break;
                                }
                                default -> {
                                    System.out.println("Opcion invalida");
                                }
                            }
                        }while(race < 1 || race > 3);
                        System.out.println("Con cuantos habitantes cuenta la comunidad?: ");
                        numberHabitants = sc.nextInt();
                        System.out.println("La comunidad cuenta con algun problema?: \n1. Si\n2. No");
                        int problems = sc.nextInt();
                        int type;
                        if (problems == 1) {
                            do{
                                System.out.println("Con que tipo de problema cuenta?: \n1. Falta de hospital \n2. Falta de escuela \n3. Falta de agua potable \n4. Acceso a alimentacion basica");
                                type = sc.nextInt();
                                switch(type){
                                    case 1 -> {
                                        mainProblems = "Hospital";
                                        break;
                                    }
                                    case 2 -> {
                                        mainProblems = "Escuela";
                                        break;
                                    }
                                    case 3 -> {
                                        mainProblems = "Agua";
                                        break;
                                    }
                                    case 4 -> {
                                        mainProblems = "Alimentacion";
                                        break;
                                    }
                                    default -> {
                                        System.out.println("Opcion Invalida");
                                    }
                                }
                            }while(type < 1 || type > 3);
                        }
                    } else {
                        System.out.println("El lugar no cuenta con una comunidad");
                        nameComunity = "";
                        typeRace = "";
                        numberHabitants = 0;
                        mainProblems = "";
                    }
                    controller.newComunity(nameComunity, typeRace, numberHabitants, mainProblems);
                    System.out.println("Cual es el nombre del representante de la comunidad?: ");
                    String deputyName = sc.nextLine();
                    System.out.println("Cual es el numero del representante de la comunidad?: ");
                    String deputyNumber = sc.nextLine();
                    break;
                }
                case 3 -> {
                    break;
                }
                case 4 -> {
                    break;
                }
                case 5 -> {
                    break;
                }
                case 6 -> {
                    break;
                }
                case 7 -> {
                    break;
                }
                case 8 -> {
                    System.out.println("Cerrando programa...");
                    break;
                }
                default -> {
                    System.out.println("Opcion invalida! Cerrando programa...");
                    break;
                }
            }
        }while(opcion != 8);
    }
}