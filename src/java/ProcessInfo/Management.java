/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Model.Bus;

public class Management{
    private static SessionFactory factory;
    public static void insertBus(String regno,String model,int capacity ){
    try{
     Configuration config=new Configuration().configure();   
    factory = new Configuration().configure().buildSessionFactory();
    Session session=factory.openSession();
    Transaction trans=session.beginTransaction();
    Bus u=new Bus();
    u.setRegno(regno);
    u.setModel(model);
    u.setCapacity(capacity);
    session.save(u);
    trans.commit();
    System.out.println("bus"+ u.getModel()+"added");
    

    }catch(Exception e){
        e.printStackTrace();
    } finally{
        
    
    }
    }
    public static void main(String[]args){
        Management au =new Management();
        insertBus("5", "toyota", 10);
    }

    
}
