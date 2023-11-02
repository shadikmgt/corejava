package string_java_mathAPI;

public class IPAddressValidator {
    public static boolean isValidIPAddress(String ipAddress){
        if (ipAddress == null || ipAddress.isEmpty()){
            return false;
        }

        String [] octets = ipAddress.split("\\.");
        if (octets.length != 4){
            return false;
        }

        for (String octet : octets){
            try{
                int num = Integer.parseInt(octet);
                if (num < 0 || num > 255){
                    return false;
                }
            } catch (NumberFormatException e){
                System.out.println(e);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (IPAddressValidator.isValidIPAddress("192.300.1.1")){
            System.out.println("Ip address is valid.");
        }else{
            System.out.println("IP address  is invalid.");
        }
    }
}
