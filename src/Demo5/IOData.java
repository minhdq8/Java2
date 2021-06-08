/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author minhdq
 */
public class IOData {

    public static Object readOb(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            ois.close();

            return object;
        } catch (IOException | ClassNotFoundException e) {
        }
        return null;
    }

    public static void writeOb(String path, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutput oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();

        } catch (Exception e) {
        }

    }

}
