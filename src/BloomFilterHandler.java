import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.TException;

import bloomfilter.*;
import java.util.*;

public class BloomFilterHandler implements BloomFilterService.Iface {

	private BloomFilter<Person> bf;

	public BloomFilterHandler() {
		bf = new BloomFilter<Person>(1000);
	}

	public BloomFilterHandler(List<Hashable<Person>> functions, int size) {
		bf = new BloomFilter<Person>(functions, size);
	}

	public void add(Person person) throws TException {
		System.out.println("Operation: add " + person);
		bf.add(person);
	}

	public boolean contain(Person person) throws TException {
		System.out.println("Operation: contain " + person);
		return bf.contain(person);
	}
}