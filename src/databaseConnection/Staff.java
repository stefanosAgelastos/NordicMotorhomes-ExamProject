package databaseConnection;

import model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aSeddik on 13-May-17.
 */
public class Staff {

    List<Employee> staff= new ArrayList();

    //TODO this list should be loaded from the database, this is a temporary testing constructor
    public Staff() {
        this.staff.add(new SalesAssistant(1,"salesperson",1234));
        this.staff.add( new Owner(2,"owner", 1234));
        this.staff.add( new SalesAssistant(3,"salesperson2",1234));
        this.staff.add( new Mechanic(4, "mechanic", 1234));
        this.staff.add( new BookKeeper(5,"bookkeeper",1234));
    }


    public Employee signIn(String username, int password) {
        for(Employee e:staff){
            if(e.identify(username, password))
                return e;
        }
        return null;
    }
}
