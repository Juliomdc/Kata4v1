
package kata4v1;

import java.util.ArrayList;

public class KATA4v1 {

    public static void main(String[] args) {
        String name = "C:\\Users\\usuario\\Downloads\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(name);
        System.out.println(mailArray.size());
        Histogram<String> histogram = HistogramMailBuilder.buid(mailArrya);
        
    }
    
}
