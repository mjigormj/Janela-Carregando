package estacionamento;
import java.util.*;
import java.sql.*;

public class CarroDAO {
    private Connection con;
    
    /*public CarroDAO(Connection con) {
        setCon(con);
    }*/

    public Connection getCon(){
        return con;
    }
    
    public CarroDAO(Connection con) {
        this.con = con;
    }

}
