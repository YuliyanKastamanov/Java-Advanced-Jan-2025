package L10_Exam_Preparation.Exercise.tanks;

import java.util.ArrayList;
import java.util.List;

public class Terrain {


    //•	type: String
    //•	List<Tank>: tanks
    //•	area: int
    private String type;
    private List<Tank> tanks;
    private int area;

    public Terrain(String type, int area) {
        this.type = type;
        this.area = area;
        this.tanks = new ArrayList<>();
    }

    public String addTank(Tank tank){
        String messageToReturn = "";
        if(checkIfExist(tank.getBrand(), tank.getModel())){
            messageToReturn = "Tank with this brand and model already exists!";
        } else if (type.equals("Swamp") && tank.getWeight() > 14000) {
            messageToReturn =  String.format("This %s is too heavy for this terrain!", tank.getBrand());
        }else {
            tanks.add(tank);
            messageToReturn = String.format("Tank %s %s added.", tank.getBrand(), tank.getModel());
        }
        return messageToReturn;
    }

    public boolean removeTank(String brand, String model){

        if(checkIfExist(brand, model)){
            Tank tankToRemove = getTankByBrandAndModel(brand, model);
            tanks.remove(tankToRemove);
            return true;
        }
        return false;
    }

    public String getTanksByBarrelCaliberMoreThan(int barrelCaliber){

        StringBuilder builder = new StringBuilder();
        List<String> tankBrands = new ArrayList<>();
        for (int i = 0; i < tanks.size(); i++) {
            if(tanks.get(i).getBarrelCaliber() > barrelCaliber){
                tankBrands.add(tanks.get(i).getBrand());
            }
        }
        if(tankBrands.isEmpty()){
            return "There are no tanks with the specified caliber.";
        }else {
            builder.append(String.format("Tanks with caliber more than %dmm: ", barrelCaliber));
            builder.append(String.join(", ", tankBrands));
        }
        return builder.toString();


    }

    public int getCount(){
        return tanks.size();
    }

    public String getTheMostArmoredTank(){
        //"{tank brand} {tank model} is the most armored tank with {armor thikness}mm. armor thickness."
        Tank mostArmouredTank = null;
        for (int i = 0; i < tanks.size(); i++) {

            if(i == 0){
                mostArmouredTank = tanks.get(i);
            }else if(mostArmouredTank.getArmor() < tanks.get(i).getArmor()){
                mostArmouredTank = tanks.get(i);
            }
        }
        return String.format("%s %s is the most armored tank with %dmm. armor thickness."
                , mostArmouredTank.getBrand(), mostArmouredTank.getModel(), mostArmouredTank.getArmor());

    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        if(tanks.isEmpty()){
            return String.format("There are no tanks in the %s.", type.toLowerCase());
        }

        builder.append(String.format("Tanks located in the %s:", type.toLowerCase()));
        for (Tank tank : tanks){
            builder.append(System.lineSeparator());
            builder.append(String.format("-- %s %s", tank.getBrand(), tank.getModel()));
        }

        return builder.toString();

    }

    public Tank getTankByBrandAndModel(String brand, String model){

        return tanks.stream().filter(t -> t.getBrand().equals(brand) && t.getModel().equals(model)).findFirst().orElse(null);
    }



    private boolean checkIfExist(String brand, String model) {

        for (int i = 0; i < tanks.size(); i++) {
            Tank currentTank = tanks.get(i);
            if(currentTank.getBrand().equals(brand) && currentTank.getModel().equals(model)){
                return true;
            }
        }
        return false;
    }
}
