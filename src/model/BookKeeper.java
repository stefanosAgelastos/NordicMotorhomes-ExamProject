package model;

/**
 * Created by aSeddik on 13-May-17.
 */
public class BookKeeper implements Employee {

    public BookKeeper(int id, String username, int password) {
        this.id=id;
        this.username=username;
        this.password=password;
    }

    private String username;
    private int password;
    private int id;

    @Override
    public boolean identify(String username, int password) {
        if(username==this.username&&password==this.password){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.username;
    }

}
