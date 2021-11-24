package kata5p1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {
    
    public static List<String> read(String file) throws FileNotFoundException, IOException {
        String line;
        List<String> validMails = new ArrayList<String>();
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        while ((line = b.readLine())!= null){
            if(line.contains("@")){
                validMails.add(line);
            }
        }
        b.close();
        return validMails;
    }
    

}