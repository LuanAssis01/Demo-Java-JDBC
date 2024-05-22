package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println("Test 1");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println();

        System.out.println("Teste 2");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println();

        System.out.println("Teste 3");
        List<Seller> listAll = sellerDao.findAll();
        listAll.forEach(System.out::println);

        System.out.println();

        System.out.println("Teste 4");
        Seller newSeller = new Seller(null, "Juliana", "jusimone@gmail.com", new Date(), 500.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println();

        System.out.println("Teste 5");
        seller = sellerDao.findById(9);
        seller.setName("Maralha");
        sellerDao.update(seller);
        System.out.println("Update completed!");

        System.out.println("Teste 7");
        System.out.print("Enter a id for delete seller in data base: ");
        Integer id = scanner.nextInt();
        sellerDao.deletById(id);
        System.out.println("Delete completed!");

        scanner.close();
    }
}
