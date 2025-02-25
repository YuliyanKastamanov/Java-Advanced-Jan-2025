package OOP.L02_Encapsulation.Exercise.PizzaCalories_04;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
       setFlourType(flourType);
       setBakingTechnique(bakingTechnique);
       setWeight(weight);
    }

    private void setFlourType(String flourType) {

        if(flourType.equals("White")){
            this.flourType = flourType;
        }else if(flourType.equals("Wholegrain")){
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {

        switch (bakingTechnique){
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;

            default:
                throw new IllegalArgumentException("Invalid type of dough.");

        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories (){

        //•	White – 1.5;
        //•	Wholegrain – 1.0;
        //•	Crispy – 0.9;
        //•	Chewy – 1.1;
        //•	Homemade – 1.0;

        double flourTypeCoefficient = 0;
        if (this.flourType.equals("White")) {
            flourTypeCoefficient = 1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            flourTypeCoefficient = 1.0;
        }

        double bakingTechnicsCoefficient = 0;
        if (this.bakingTechnique.equals("Crispy")) {
            bakingTechnicsCoefficient = 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            bakingTechnicsCoefficient = 1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            bakingTechnicsCoefficient = 1.0;
        }


        return 2 * this.weight * flourTypeCoefficient * bakingTechnicsCoefficient;


    }
}
