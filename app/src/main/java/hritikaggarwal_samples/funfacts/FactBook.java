package hritikaggarwal_samples.funfacts;


import java.util.Random;

public class FactBook {
    public String[] facts = {
            "Ostriches can run faster than horses.",
            "Russia has a larger surface area than Pluto.",
            "If the sun were the size of a white blood cell then the Milky Way Galaxy would be the size of the United States.",
            "There are more stars in space than there are grains of sand on every beach in the world.",
            "If you consistently fart for 6 years & 9 months, enough gas is produced to create the energy of an atomic bomb!",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "Olympics Gold medals are mostly made of Silver.",
            "Ants stretch up in the morning when they wake up.",
            "Polar bears can eat as many as 86 penguins in a single sitting."
    };

    public String getFact()
    {


        String fact = "";

        //randomising
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];

        return fact;
    }
}
