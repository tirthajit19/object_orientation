package methods;

public class PumpkinSoup {
    public PumpkinSoup() {
        System.out.println("Preparing Pumpkin Soup");
    }

    public PumpkinSoup heatSaucepan(){
        System.out.println("Heat oil in a large saucepan over low heat");
        return this;
    }

    public PumpkinSoup addOnionLeek(){
        System.out.println("Add Onion and Leek and cook for 2 to 3 mins until softened but not colored");
        return this;
    }

    public PumpkinSoup addGarlicSpices(){
        System.out.println("Add Garlic and spices and then cook for 30 mins");
        return this;
    }

    public PumpkinSoup addPumpkinPotato(){
        System.out.println("Add pumpkin, potato and stock and bring to boil");
        return this;
    }

    public PumpkinSoup simmer(){
        System.out.println("Turn heat to low, cover and simmer for 30 mins");
        return this;
    }

    public PumpkinSoup letItCool(){
        System.out.println("Allow to cool slightly and blend in batches");
        return this;
    }

    public PumpkinSoup heatItUp(){
        System.out.println("Return soup to pan, stir through cream and reheat gently");
        return this;
    }

    public PumpkinSoup serve(){
        System.out.println("Serve and enjoy the Hot and Creamy Pumpkin Soup");
        return this;
    }

    public static void main(String[] args) {
        PumpkinSoup object = new PumpkinSoup();
        object
                .heatSaucepan()
                .addOnionLeek()
                .addGarlicSpices()
                .addPumpkinPotato()
                .simmer()
                .letItCool()
                .heatItUp()
                .serve();
    }
}
