package by.pvt.autoserializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 8.0, "X5", 2009, "Vasiliev");
        String file = "src/serialization.txt";
        serialize(auto, file);
        deserialize(file);
    }

        static void serialize(Auto auto, String file) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(auto);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        static void deserialize(String file) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                Auto auto = (Auto) objectInputStream.readObject();
                System.out.println(auto);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
