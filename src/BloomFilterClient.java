import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import bloomfilter.*;
import java.util.*;
import java.io.*;

public class BloomFilterClient {
    public static void main(String [] args) {

        try {
            TTransport transport;
       
            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            BloomFilterService.Client client = new BloomFilterService.Client(protocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        } 
    }

    private static void perform(BloomFilterService.Client client) throws TException {
        // client.add(new Person("Yang", "Pei", 24, "pyemma1991@gmail.com"));
        // client.add(new Person("Haruka", "Uami", 20, "haruka@gmail.com"));
        // System.out.println("Is Yang there? " + client.contain(new Person("Yang", "Pei", 24, "pyemma1991@gmail.com")));
        // System.out.println("Is Mashiro there? " + client.contain(new Person("Mashiro", "Shina", 19, "mashiro@gmail.com")));
        // client.add("apple");
        // client.add("banana");
        // System.out.println("Is apple there? " + client.contain("apple"));
        // System.out.println("Is pineapple there? " + client.contain("pienapple"));
        try {
            File file = new File("data/words.txt");
            Scanner scan = new Scanner(file);
            ArrayList<String> list = new ArrayList<String>();
            HashSet<String> set = new HashSet<String>();
            Random random = new Random();
            
            while (scan.hasNext()) 
                list.add(scan.next());
            int wordNumber = list.size();

            int correct = 0, error = 0, total = 30000;
            for (int i = 0; i < total; ++i) {
                int operand = random.nextInt(2);
                int index = random.nextInt(wordNumber);
                if (operand == 0) {
                    client.add(list.get(index));
                    set.add(list.get(index));
                } else {
                    boolean result = client.contain(list.get(index));
                    if (set.contains(list.get(index)) == result)
                        ++correct;
                    else
                        ++error;
                }
            }
            double accuracy = (double)correct / (correct + error);
            System.out.println("Final accuracy: " + accuracy);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}