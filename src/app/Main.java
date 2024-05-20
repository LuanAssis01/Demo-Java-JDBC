package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Eletronics");
        Seller seller = new Seller(20, "Luan", "luanassis@gmail.com", new Date(), 7000.00, obj);

        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println(sellerDao);
        System.out.println(obj);
        System.out.println(seller);
    }
}
