package chat여러명;
import java.net.Socket;
class ClientExample4 {
    public static void main(String[] args) {
        if (args.length != 1) {//args를 사용할려면 콘솔이 아닌 명령 프롬프트에서 사용해야한다.
            System.out.println(
                "Usage: java ClientExample4 <user-name>");
            return;
        }
        try {
            Socket socket = new Socket("192.168.0.63",9002);//아이피 및 포트를 정한다.
            Thread thread1 = new SenderThread(socket,args[0]); 
            Thread thread2 = new ReceiverThread(socket);
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}