package day25inputoutputstreamsP.text01;


import java.io.*;

public class P5_ObjectInputOutputStream implements Serializable {

    private String brand;
    private String model;

    public P5_ObjectInputOutputStream(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }

}

// ObjectInputStream

class Main{
    public static void main(String[] args) {
        P5_ObjectInputOutputStream input = new P5_ObjectInputOutputStream("Mercedes","BMV");

        try {
            FileInputStream inputStream = new FileInputStream("src/day25inputoutputstreamsP/ObjectInputOutput.txt");
            ObjectInputStream  objectInputStream = new ObjectInputStream(inputStream);
            P5_ObjectInputOutputStream newCar = (P5_ObjectInputOutputStream)objectInputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

