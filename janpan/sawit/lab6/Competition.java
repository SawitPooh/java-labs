package janpan.sawit.lab6;

//import class to use.
import java.util.ArrayList;

/*
 * This Program Competition  is abstract class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */

//define abstract class.
abstract class Competition {
    protected String name, region;

    public String name_get(String name) {
        // this method will return type string attribute name.
        return name;
    }

    public String region_get(String region) {
        // this method will return type string attribute region.
        return region;
    }

    public void name_set(String name) {
        // this method will change current attribute to new attribute from parameter.
        this.name = name;
    }

    public void region_setter(String region) {
        // this method will change current attribute to new attribute from parameter.
        this.region = region;
    }

    public abstract void setDescription(); // Abstract method (does not have a body)

    public abstract void setSponsorship(ArrayList<String> sponsors); // Abstract method (does not have a body)

}
