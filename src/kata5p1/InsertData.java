package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertData {
    private Connection connect(){
            String url = "jdbc:sqlite:KATA5.db";
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(url);
                System.out.println("Conexión a SQLite establecida, procediendo a la insercion de nuevos datos");
            }catch(SQLException e){System.out.println(e.getMessage());

            }
            return conn;
        }
    public void insert(String email){
        String sentence = "INSERT INTO direcc_email(direccion) VALUES(?)";
        try(Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sentence)) {
            pstmt.setString(1, email);
            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
