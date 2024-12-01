package HomeWork3;

public class Computer {
    public void use(USB usb){
        USB usb1 = usb;
        usb1.insert();
        if(usb1 instanceof Mouse){
            Mouse m = (Mouse) usb1;
            m.click();
        }
        else if (usb1 instanceof Keyboard) {
        Keyboard k = (Keyboard) usb1;
        k.input();
        }
        else System.out.println("不支持");
        usb1.exit();
    }
}
