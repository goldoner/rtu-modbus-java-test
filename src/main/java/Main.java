import de.re.easymodbus.modbusclient.*;

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
        try {
            modbusClient.Connect("/dev/ttyUSB0");
            System.out.println(modbusClient.ReadHoldingRegisters(0, 1)[0]);
            System.out.println(ModbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(1000, 3)));
        } catch (Exception e) {

        }


//        ModbusClient modbusClient = new ModbusClient();
//        modbusClient.Connect("/dev/ttyUSB0");
//        System.out.println("Is connected with default parameters : " + modbusClient.isConnected());
//
//        System.out.println((float) modbusClient.ReadHoldingRegisters(4024, 1)[0]);
//
//
//        System.out.println((float) modbusClient.ReadHoldingRegisters(1000, 3)[0]);
//
//        System.out.println();

//        modbusClient.Disconnect();
    }
}
