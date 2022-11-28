interface Smartphones {
    void call();

    void sms();

    void internet();
}

interface LinuxOS {
    void CLI();

    void GUI();
}

interface IOS {
    void multitouch();

    void macOS();
}

class Androids implements Smartphones, LinuxOS {
    String name;

    Androids(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void sms() {
        System.out.println("sms");
    }

    @Override
    public void internet() {
        System.out.println("internet");
    }

    @Override
    public void CLI() {
        System.out.println("command-line interface");
    }

    @Override
    public void GUI() {
        System.out.println("graphical user interface");
    }

}

class iPhones implements Smartphones, IOS {
    String name;

    iPhones(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void sms() {
        System.out.println("sms");
    }

    @Override
    public void internet() {
        System.out.println("internet");
    }

    @Override
    public void multitouch() {
        System.out.println("multitouch");
    }

    @Override
    public void macOS() {
        System.out.println("macOS");
    }

}

class Interface {
    public static void main(String[] args) {

        iPhones iPhone16sProMax = new iPhones("iPhone 16 S Pro Max");
        System.out.println("Device name: " + iPhone16sProMax.name);
        System.out.println("Specification:");
        iPhone16sProMax.call();
        iPhone16sProMax.sms();
        iPhone16sProMax.internet();
        iPhone16sProMax.multitouch();
        iPhone16sProMax.macOS();

        System.out.println("**************************************");

        Androids HuaweiMateProXXL = new Androids("Huawei Mate Pro XXL");
        System.out.println("Device name: " + HuaweiMateProXXL.name);
        System.out.println("Specification:");
        HuaweiMateProXXL.call();
        HuaweiMateProXXL.sms();
        HuaweiMateProXXL.internet();
        HuaweiMateProXXL.CLI();
        HuaweiMateProXXL.GUI();

    }

}

