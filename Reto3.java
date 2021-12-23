#Name FuncionesArticulos.java

import java.util.*;

public class FuncionesArticulos {
      
     
    public ArrayList <Object> obtenerArticulos(ArrayList listaArticulos){
        ArrayList listaObtener=new ArrayList();
        
        for(int i=0; i<listaArticulos.size(); i++){
            
            if (listaObtener.contains(listaArticulos.get(i))){
            
            }else{ 
                listaObtener.add((listaArticulos.get(i)));
            }
        }
        return listaObtener;
    }

    // Punto 2
   @SuppressWarnings("unchecked")
    public static ArrayList obtenerPosicionesArticulosFaltantes(ArrayList IPos, ArrayList Tipos, String categoria) {
        ArrayList<String> temporal = new ArrayList<>();
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < Tipos.size(); i++) {
            if (Tipos.get(i) == categoria)
                temporal.add(String.valueOf(i));
        }
        for (int i = 0; i < IPos.size(); i++) {
            for (int j = 0; j < temporal.size(); j++) {
                if (String.valueOf(IPos.get(i)).equals(temporal.get(j)))
                    resultado.add(String.valueOf(IPos.get(i)));
            }
        }
        return (ArrayList) resultado;
    }
    // Punto 3
    public ArrayList<String> obtenerFaltantes(
            ArrayList<String> iOtro,
            ArrayList<String> IAseoTic) {

        ArrayList<String> diferencias = new ArrayList<>();

        for (String articulos : iOtro) {
            if (!IAseoTic.contains(articulos)) {
                diferencias.add(articulos);
            }
        }

        return diferencias;

    }


    public String obtenerArticulosIntercambiables(
            ArrayList<String> iOtro,
            ArrayList<String> IAseoTic){
        
        ArrayList<String> diferencias1 = new ArrayList<>();
        ArrayList<String> diferencias2 = new ArrayList<>();
        int intercambios = 0;
        
        for (String articulos : iOtro){            
            if(!IAseoTic.contains(articulos)){
                diferencias1.add(articulos);
            }            
        }
        
        for (String articulos : IAseoTic){            
            if(!iOtro.contains(articulos)){
                diferencias2.add(articulos);
            }            
        }
        
        if(diferencias1.size() < diferencias2.size()){
            intercambios = diferencias1.size();
        }else{
            intercambios = diferencias2.size();
        }
        
        //return ""+intercambios;
        return String.valueOf(intercambios);             
        
    } 

}
