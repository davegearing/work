package teststuff;

import java.util.*;

public class CRGuid {

    public static void main(String arg[]){

        for(int i=0;i<100000;i++){
            UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();
            System.out.println("UUID #"+ i +" is " + randomUUIDString);
        }
    }
}
