package hritikaggarwal_samples.funfacts;


import java.util.Random;

public class bgChange {
    public String[] colors =
            {
                    "#3079ab","#c25975","#f9845b","#7d669e","#637a91","#f092b0","#16a085","#e74c3c","#2c3e50","#9b59b6"
            };

    public String getColor()
    {
        String Color = "";

        Random colorRandom = new Random();
        int randomColor = colorRandom.nextInt(colors.length);

        Color = colors[randomColor];

        return Color;
    }
}
