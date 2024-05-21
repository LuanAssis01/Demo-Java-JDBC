package app;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println("Test 1");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println();

        System.out.println("Teste 2");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("Teste 3");
        List<Seller> listAll = sellerDao.findAll();
        listAll.forEach(System.out::println);
    }
}
