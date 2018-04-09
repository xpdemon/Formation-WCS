

public class SecretSentence
{



    private  String writeSecretSentence(String bestiole,String place)
    {
        String sentence ;
        sentence =bestiole+ " s'incline face à "+place;

        return sentence;
    }

    private Boolean isRightSentence(String animal ,String place)
    {

        String animalTrue = "poulet";
        String placeTrue = "nid";

        if(animalTrue == animal && placeTrue == place)
        {
            return true;
        }

        return false;
    }


    public static void main(String[] args)
    {
        String animal = "poulet";
        String place = "nid";
        SecretSentence phrase = new SecretSentence();
        System.out.println(phrase.writeSecretSentence(animal,place));

        if(phrase.isRightSentence(animal,place))
        {
            System.out.println("Bonne Phrase");
        }
        else
        {
            System.out.println("Mauvaise Phrase");
        }
    }
}




