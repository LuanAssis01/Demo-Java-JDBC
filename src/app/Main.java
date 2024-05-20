package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Eletronics");
        Seller seller = new Seller(20, "Luan", "luanassis@gmail.com", new Date(), 7000.00, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
