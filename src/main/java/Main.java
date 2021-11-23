import com.fazecast.jSerialComm.SerialPort;

import java.io.InputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World!");

        // /dev/ttyUSB0


        System.out.println(Arrays.toString(Arrays.stream(SerialPort.getCommPorts()).toArray()));


       // SerialPort comPort = SerialPort.getCommPorts()[0];
        SerialPort comPort = SerialPort.getCommPort("/dev/ttyUSB0");


        comPort.setBaudRate(600);
        comPort.setParity(SerialPort.NO_PARITY);
        comPort.setNumDataBits(8);
        comPort.openPort();
        System.out.println("Is port opened: " + comPort.isOpen());
         comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        InputStream in = comPort.getInputStream();
        try {
            for (int j = 0; j < 1000; ++j)
                System.out.print((char) in.read());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        comPort.closePort();

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
