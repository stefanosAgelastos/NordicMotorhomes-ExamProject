package model;

/**
 * Created by aSeddik on 13-May-17.
 */
public class SalesAssistant implements Employee {

    private String username;
    private int password;
    private int id;

    //this is a Constructor, whenever you instantiate a SalesAssistant object
    //you can use this one by passing these three parameters (int id, String username, int password)
    public SalesAssistant(int id, String username, int password) {

        this.id=id;
        this.username=username;
        this.password=password;
    }


    @Override
    public boolean identify(String username, int password) {
        if(username.equals(this.username) &&password==this.password){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.username;
    }
}
