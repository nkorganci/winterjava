package day42designpatterns;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.PortUnreachableException;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
       OS obj= osf.getInstance("Open");
       obj.spec();


    }
}

class Android implements OS{
    public void spec(){
        System.out.println("Powerful OS");
    }
}


class IOS implements  OS{

    @Override
    public void spec() {
        System.out.println("Powerful IOS");
    }
}

class Windows implements OS{

    @Override
    public void spec() {
        System.out.println("windows");

    }
}

class OperatingSystemFactory{
    public OS getInstance(String str){

        if(str.equals("Open")){
            return new Android();
        }else{
            return new Windows();
        }
    }
}

interface OS{
    void spec();
}
