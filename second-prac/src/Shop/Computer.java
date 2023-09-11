package Shop;

import java.util.Scanner;

public class Computer {
    String model;
    String processor;
    String videocard;
    public Computer()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите модель: ");
        this.model = in.nextLine();
        System.out.println("Введите процессор: ");
        this.processor = in.nextLine();
        System.out.println("Введите видеокарту: ");
        this.videocard = in.nextLine();
    }

    public Computer(String model, String processor,String videocard)
    {
        this.model = model;
        this.processor = processor;
        this.videocard = videocard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", videocard='" + videocard + '\'' +
                '}';
    }
}
