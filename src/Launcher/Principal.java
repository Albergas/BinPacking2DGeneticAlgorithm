package Launcher;
import Dominio.Mochila;
import Dominio.Item;
import Logica.AlgoritmoGenetico;
import Logica.Colocacion;
import Logica.Generacion;
import Logica.Posicion;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        Mochila mochila = new Mochila(10,10);
        mochila.mostrar();

        Colocacion colocacion;

        Item h1 = new Item(10,5);
        Item h2 = new Item(10,1);
        Item h3 = new Item(4,1);
        Item h4 = new Item(2,3);
        Item h5 = new Item(2,7);
        Item h6 = new Item(1,2);
        Item h7 = new Item(1,1);

        Item i1 = new Item(1,1);
        Item i2 = new Item(2,2);
        Item i3 = new Item(3,6);
        Item i4 = new Item(4,4);
        Item i5 = new Item(5,2);
        Item i6 = new Item(6,1);
        Item i7 = new Item(7,8);
        Item i8 = new Item(3,2);
        Item i9 = new Item(4,1);

        Item j1 = new Item(7,2);
        Item j2 = new Item(7,2);
        Item j3 = new Item(4,4);
        Item j4 = new Item(4,6);
        Item j5 = new Item(8,2);
        Item j6 = new Item(1,1);
        Item j7 = new Item(6,3);
        Item j8 = new Item(7,2);
        Item j9 = new Item(5,5);

        Item k1 = new Item(7,2);
        Item k2 = new Item(8,2);
        Item k3 = new Item(4,4);
        Item k4 = new Item(4,6);
        Item k5 = new Item(7,2);
        Item k6 = new Item(1,1);
        Item k7 = new Item(6,3);
        Item k8 = new Item(7,2);
        Item k9 = new Item(5,5);

        Item p1 = new Item(1,1);
        Item p2 = new Item(2,2);
        Item p3 = new Item(1,2);
        Item p4 = new Item(3,1);
        Item p5 = new Item(2,2);

        List<Item> items = new ArrayList<Item>();

        items.add(h1);
        items.add(h2);
        items.add(h3);
        items.add(h3);
        items.add(h3);
        items.add(h4);
        items.add(h5);
        items.add(h6);
        items.add(h6);
        items.add(h6);
        items.add(h7);
        items.add(h7);

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(j1);
        items.add(j2);
        items.add(j3);
        items.add(j4);
        items.add(j5);
        items.add(j6);
        items.add(j7);
        items.add(j8);
        items.add(j9);
        items.add(k1);
        items.add(k2);
        items.add(k3);
        items.add(k4);
        items.add(k5);
        items.add(k6);
        items.add(k7);
        items.add(k8);
        items.add(k9);
        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(j1);
        items.add(j2);
        items.add(j3);
        items.add(j4);
        items.add(j5);
        items.add(j6);
        items.add(j7);
        items.add(j8);
        items.add(j9);
        items.add(k1);
        items.add(k2);
        items.add(k3);
        items.add(k4);
        items.add(k5);
        items.add(k6);
        items.add(k7);
        items.add(k8);
        items.add(k9);
        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        items.add(k1);
        items.add(k2);
        items.add(k3);
        items.add(k4);
        items.add(k5);
        items.add(k6);
        items.add(k7);
        items.add(k8);
        items.add(k9);

        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);


        List<Colocacion> colocaciones = new ArrayList<Colocacion>();
        for(int i = 0; i < 15; i++){
            colocaciones.add(new Colocacion(mochila, items));
        }

        Generacion generacion = new Generacion(colocaciones);

        AlgoritmoGenetico alg = new AlgoritmoGenetico(generacion);

        for(int i = 0; i < 100; i++){
            alg.evolucionar();
            System.out.println("Iteracion "+i+": "+alg.logPorcentajeGenActual());
        }

        System.out.println(alg.logS());
        System.out.println(alg.logPuntos());
        System.out.println(alg.getMejorColocacion().logS());
        System.out.println(alg.getMejorColocacion().log());
        System.out.println(alg.logMejorSolucion());
    }
}