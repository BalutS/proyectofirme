package com.modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class Dao {

    public static void guardarDatos(Colegio colegio, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(colegio);
        } catch (IOException e) {
            System.err.println("Error guardando datos: " + e.getMessage());
        }
    }

    public static Colegio cargarDatos(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Colegio) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de datos no encontrado, se creará uno nuevo al guardar.");
            return null;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error cargando datos: " + e.getMessage());
            return null;
        }
    }
}
