package kata4v1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MailListReader {
    
    public static ArrayList<String> read (String nameFile){
        ArrayList <String> mailList = new ArrayList <>();
        BufferedReader reader = new BufferedReader (new FileReader (new File()));
        String mail;
        
        while ((mail = reader.readline()) != null){
            if(!mail.contains("@")){
                continue;
            }
            mailList.add(mail);
            
        }
    }
    
}
