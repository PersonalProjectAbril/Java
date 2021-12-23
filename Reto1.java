import java.util.Scanner;
class Main {
 public static void main(String [] args) {

    String Zona ="";
    Scanner lt = new Scanner (System.in);
    String personas = lt.nextLine();
    int Truchas = Integer.parseInt(personas);
    int Lulos = (Truchas*2)+ 4;
    int Piñas = (Truchas + Lulos) / 5;

    if (Piñas<=20){
      Zona = "uno";
    }else if(Piñas>=21 & Piñas<=30){
      Zona = "dos";
    }else if(Piñas>=31 & Piñas<=50){
      Zona = "tres";
    }else if(Piñas>50){
      Zona = "cuatro";
    } 
  System.out.println(Truchas + " " + Lulos + " "+ Piñas+"\n" + Zona);
  }
}
