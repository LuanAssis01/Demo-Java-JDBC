package model.dao;

import db.DB;
import model.dao.impl.SellerDAOJDBC;

public class DaoFactory {
    
    public static SellerDAO createSellerDao(){
        return new SellerDAOJDBC(DB.getConnection());
    }
}
