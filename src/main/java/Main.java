import de.re.easymodbus.modbusclient.ModbusClient;


import de.re.easymodbus.exceptions.ConnectionException;
import de.re.easymodbus.exceptions.FunctionCodeNotSupportedException;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.exceptions.QuantityInvalidException;
import de.re.easymodbus.exceptions.StartingAddressInvalidException;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

//        System.out.println("Hello World!");
//
//        // /dev/ttyUSB0
//
//
//        System.out.println(Arrays.toString(Arrays.stream(SerialPort.getCommPorts()).toArray()));
//

        // SerialPort comPort = SerialPort.getCommPorts()[0];
//        SerialPort comPort = SerialPort.getCommPort("/dev/ttyUSB0");
//        comPort.setBaudRate(9600);
//        comPort.setParity(SerialPort.NO_PARITY);
//        comPort.setNumStopBits(SerialPort.ONE_STOP_BIT);
//
//        // 9600 19200 38400
//
//
//        comPort.openPort();
//        System.out.println("Is port opened: " + comPort.isOpen());
//        try {
//            while (true)
//            {
//                while (comPort.bytesAvailable() == 0) {
//                    Thread.sleep(20);
//                }
//
//                byte[] readBuffer = new byte[comPort.bytesAvailable()];
//                int numRead = comPort.readBytes(readBuffer, readBuffer.length);
//                System.out.println("Read " + numRead + " bytes.");
//            }
//        } catch (Exception e) { e.printStackTrace(); }
//        comPort.closePort();

//        SerialPort serialPort = new SerialPort("/dev/ttyUSB0", 600, Parity.NONE, 8);
//        serialPort.Open();
//        System.out.println("Test serial port is opened : " + serialPort.isOpened());
//        System.out.println();


        ModbusClient modbusClient = new ModbusClient();
        modbusClient.Connect("/dev/ttyUSB0");
        System.out.println("Is connected with default parameters : " + modbusClient.isConnected());

        System.out.println((float) modbusClient.ReadHoldingRegisters(4024, 1)[0]);



        System.out.println((float) modbusClient.ReadHoldingRegisters(1000, 3)[0]);

        System.out.println();

//        modbusClient.Disconnect();
    }
}
