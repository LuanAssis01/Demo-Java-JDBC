package app;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class MainDepartment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DepartmentDAO departmentDAO = DaoFactory.createDepartmenteDAO();

        System.out.println("Test Insert");
        Department dep = new Department(null, "Music");
        departmentDAO.insert(dep);
        System.out.println("Inserted! New Id = " + dep.getId());

        System.out.println();

        System.out.println("Test Update");
        dep = departmentDAO.findById(4);
        dep.setName("Esports");
        departmentDAO.update(dep);
        System.out.println("Update completed!");

        System.out.println();

        System.out.println("Teste Delete");
        System.out.print("Enter a id for delete department in data base: ");
        Integer id = scanner.nextInt();
        departmentDAO.deleteById(id);
        System.out.println("Delete completed!");

        System.out.println();

        System.out.println("Test find by id");
        dep = departmentDAO.findById(1);
        System.out.println(dep);

        System.out.println();

        System.out.println("Test findAll");
        List<Department> listDep = departmentDAO.findAll();
        listDep.forEach(System.out::println);

        System.out.println();

        scanner.close();
    }
}
