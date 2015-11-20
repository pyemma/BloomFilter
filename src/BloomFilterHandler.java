import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.TException;

import bloomfilter.*;
import java.util.*;

public class BloomFilterHandler implements BloomFilterService.Iface {

    // private BloomFilter<Person> bf;
    private BloomFilter<String> bf;

    public BloomFilterHandler() {
        // bf = new BloomFilter<Person>(1000);
        bf = new BloomFilter<String>(1000);
    }

    public BloomFilterHandler(List<Hashable<String>> functions, int size) {
        // bf = new BloomFilter<Person>(functions, size);
        bf = new BloomFilter<String>(functions, size);
    }

    // public void add(Person person) throws TException {
    //  System.out.println("Operation: add " + person);
    //  bf.add(person);
    // }

    // public boolean contain(Person person) throws TException {
    //  System.out.println("Operation: contain " + person);
    //  return bf.contain(person);
    // }

    public void add(String str) throws TException {
        System.out.println("Operation: add " + str);
        bf.add(str);
    }

    public boolean contain(String str) throws TException {
        System.out.println("Operation: contain " + str);
        return bf.contain(str);
    }
}