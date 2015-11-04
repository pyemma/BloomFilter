import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import bloomfilter.*;
import java.util.*;

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

  private static void perform(BloomFilterService.Client client) throws TException
  {

      client.add(new Person("Yang", "Pei", 24, "pyemma1991@gmail.com"));
      client.add(new Person("Haruka", "Uami", 20, "haruka@gmail.com"));
      System.out.println("Is Yang there? " + client.contain(new Person("Yang", "Pei", 24, "pyemma1991@gmail.com")));
      System.out.println("Is Mashiro there? " + client.contain(new Person("Mashiro", "Shina", 19, "mashiro@gmail.com")));
  }
}