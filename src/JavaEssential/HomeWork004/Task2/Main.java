package JavaEssential.HomeWork004.Task2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(3);
        
        AbstractHandler typeHandler = null;
        
        switch (result) {
            case 0: typeHandler = new XMLHandler();
                break;
            case 1: typeHandler = new TXTHandler();
                break;
            case 2: typeHandler = new DOCHandler();
                break;
        }


        if (typeHandler instanceof XMLHandler) {

            typeHandler.open();
            typeHandler.create();
            typeHandler.change();
            typeHandler.save();

        } else if (typeHandler instanceof TXTHandler) {

            typeHandler.open();
            typeHandler.create();
            typeHandler.change();
            typeHandler.save();

        } else if (typeHandler instanceof DOCHandler) {

            typeHandler.open();
            typeHandler.create();
            typeHandler.change();
            typeHandler.save();

        }
    }

}
