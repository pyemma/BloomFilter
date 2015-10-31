import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.TException;

public class MultiplicationServer {

  public static class MultiplicationHandler implements MultiplicationService.Iface {
    
    public int multiply(int n1, int n2) throws TException {
      System.out.println("Multiply(" + n1 + ", " + n2 + ")");
      return n1 * n2;
    }
  }

  public static MultiplicationHandler handler;

  public static MultiplicationService.Processor processor;

  public static void main(String [] args) {
    try {
      handler = new MultiplicationHandler();
      processor = new MultiplicationService.Processor(handler);

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

  public static void simple(MultiplicationService.Processor processor) {
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