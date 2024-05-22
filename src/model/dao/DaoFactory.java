package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOJDBC;
import model.dao.impl.SellerDAOJDBC;

public class DaoFactory {
    
    public static SellerDAO createSellerDao(){
        return new SellerDAOJDBC(DB.getConnection());
    }

    public static DepartmentDAOJDBC createDepartmenteDAO(){
        return new DepartmentDAOJDBC(DB.getConnection());
    }
}
