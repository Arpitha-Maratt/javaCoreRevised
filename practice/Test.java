package practice;


final class Profile{
    private String name;
    private String city;

    Profile(String name,String city){
        this.name=name;
        this.city=city;
    }

    String getName(){
        return name;
    }

    String getCity(){
        return city;
    }

    void setName(String name){
        this.name=name;
    }

    void setCity(String city){
        this.city=city;
    }

    static final class ProfileSantizer{
        Profile Santize(Profile input){
            return new Profile(
                    input.getName().trim(),
                    input.getCity().trim()
            );
        }
    }


public class Test {
    public static void main(String[] args) {
        Profile p = new Profile("Arpitha","Shimoga");
        ProfileSantizer s = new ProfileSantizer();

        Profile clean = s.Santize(p);

        assert p.getName().equals("Arpitha");
        assert clean.getName().equals("Arpitha");
    }
}
}
