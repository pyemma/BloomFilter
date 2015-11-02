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

      client.add("apple");
      client.add("banana");
      System.out.println("Is apple there? " + client.contain("apple"));
      System.out.println("Is pineapple there? " + client.contain("pineapple"));
  }
}