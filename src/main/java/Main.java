import com.fazecast.jSerialComm.SerialPort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World!");


        System.out.println(Arrays.toString(Arrays.stream(SerialPort.getCommPorts()).toArray()));

//        SerialPort serialPort = new SerialPort("/dev/ttyUSB0", 600, Parity.NONE, 8);
//        serialPort.Open();
//        System.out.println("Test serial port is opened : " + serialPort.isOpened());
//        System.out.println();


//        ModbusClient modbusClient = new ModbusClient();
//        modbusClient.Connect("/dev/ttyUSB0");
//        System.out.println("Is connected with default parameters : " + modbusClient.isConnected());
//        System.out.println();
//
//        modbusClient.Disconnect();
    }
}
