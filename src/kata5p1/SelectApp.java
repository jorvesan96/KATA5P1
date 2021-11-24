package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
        private Connection connect(){
            String url = "jdbc:sqlite:KATA5.db";
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(url);
                System.out.println("Conexión a SQLite establecida, procediendo a la seleccion de datos");
            }catch(SQLException e){System.out.println(e.getMessage());

            }
            return conn;
        }
    public void instruction(){
        String sql = "SELECT * FROM PEOPLE";
        try(Connection conn = this.connect();
            Statement state = conn.createStatement();
            ResultSet resultSet = state.executeQuery(sql)){
            
            while(resultSet.next()){
               
                System.out.println(resultSet.getInt("Id")
                        +"\t"+resultSet.getString("Name")
                        +"\t"+resultSet.getString("Apellidos")
                        +"\t"+resultSet.getString("Departamento"));

            
            }
        }catch(SQLException exe){
            System.out.println(exe.getMessage());
        }
        
    }
}
