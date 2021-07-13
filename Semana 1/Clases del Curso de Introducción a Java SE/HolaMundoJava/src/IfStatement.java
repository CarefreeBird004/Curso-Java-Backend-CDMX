public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSend= 3;

        if (isBluetoothEnable){
            //Send file
            fileSend++;
            System.out.println("Archivo Enviado");
            int i=0;
            i++;
        }else{
            fileSend--;
            System.out.println("Por favor enciende tu Bluetooth, para iniciar la trasferencia ");
        }
        System.out.println(isBluetoothEnable);
        System.out.println(fileSend);

    }
}
