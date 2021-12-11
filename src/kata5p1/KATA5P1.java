package kata5p1;

import java.util.ArrayList;
import java.util.List;
import static kata5p1.MailListReader.read;


public class KATA5P1 {
    
    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.instruction();
        CrearTabla tabla = new CrearTabla();
        tabla.createNewTable();
        
        String filePath = "email.txt";
        List<String> email = new ArrayList<>();
        try {
            email = read(filePath);
        }catch(Exception e){
            System.out.println("Archivo no encontrado");
        }
        
       InsertData data = new InsertData();

        for (String string : email) {
            data.insert(string);
        }

    }
}
