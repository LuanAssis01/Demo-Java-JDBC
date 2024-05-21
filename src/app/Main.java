package app;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println("                                         === TEST ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
