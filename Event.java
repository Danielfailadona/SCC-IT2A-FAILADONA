
package event;

import java.util.Scanner;


public class Event {






    


private void viewEvents() {
    Config conf = new Config();
        String EventQuery = "SELECT * FROM events";
        String[] EventHeaders = {"ID", "Event_Name", "Event_Date", "Location", "Description", "Organizer"};
        String[] EventColumns = {"id", "event_name", "event_date", "location", "description", "organizer"};
        
        conf.viewRecords(EventQuery, EventHeaders, EventColumns);
    }






    
    
    
    
    
//---------------------------------------------
    public static void main(String[] args) {
        
        


        Scanner sc = new Scanner(System.in);
        Config conf = new Config();
        
        System.out.print("Event Name: ");
        String e_name = sc.next();
        System.out.print("Event Date: ");
        String e_date = sc.next();
        System.out.print("Location: ");
        String e_location = sc.next();
        System.out.print("Description: ");
        String e_discpt = sc.next();
        System.out.print("Description: ");
        String e_organzr = sc.next();
        
        String sql = "INSERT INTO Student (s_fname, s_lname, s_email, s_status) VALUES (?, ?, ?, ?)";

        
        conf.addEvents(sql, e_name, e_date, e_location, e_discpt, e_organzr);
        
    
    

        
        
        
        
        
        
        
        
        

    }//END OF MAIN CLASS
    
}//END OF EVENT CLASS
