package OOP.L12_DesignPatterns.Exercise.builderExercise;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Contact {

    private String name;
    private String number;
    private String company;
    private String title;
    private String email;
    private String website;
    private String birthday;

 /*   public Contact withName(String name){
        this.name = name;
        return this;
    }

    public Contact withNumber(String number){
        this.number = number;
        return this;
    }
    public Contact withCompany(String company){
        this.company = company;
        return this;
    }

    public Contact withWebsite(String website){
        this.website = website;
        return this;
    }*/



   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().equals("") || name.length() < 2) {
            throw new IllegalStateException("The name must contain at least 2 characters!");
        }

        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null || number.trim().equals("") || number.length() < 5) {
            throw new IllegalStateException("The name must contain at least 5 characters!");
        }

        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getBirthday() {
        return birthday;
    }*/

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
