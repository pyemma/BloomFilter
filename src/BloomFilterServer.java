import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.TException;

import bloomfilter.*;
import java.util.*;

/* 
	only support string type now
*/

public class BloomFilterServer {

	public static BloomFilterService.Processor processor;

	public static void main(String[] args) {
		try {
			List<Hashable<String>> functions = new ArrayList<Hashable<String>>();
			functions.add(new StringHash(17));
			functions.add(new StringHash(23));
			functions.add(new StringHash(31));
			BloomFilterHandler handler = new BloomFilterHandler(functions, 1000);
			processor = new BloomFilterService.Processor(handler);

			Runnable simple = new Runnable() {
				public void run() {
					simple(processor);
				}
			};

			new Thread(simple).start();

		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	public static void simple(BloomFilterService.Processor processor) {
		try {
			TServerTransport serverTransport = new TServerSocket(9090);
      		TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));

      		System.out.println("Starting the simple server...");
      		server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}