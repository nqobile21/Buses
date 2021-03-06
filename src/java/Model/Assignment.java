package Model;
// Generated 24 Feb 2016 10:33:08 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Assignment generated by hbm2java
 */
@Entity
@Table(name="assignment"
    ,catalog="vutbus"
)
public class Assignment  implements java.io.Serializable {


     private String assignmentCode;
     private Bus bus;
     private Location location;
     private String assignmentDay;

    public Assignment() {
    }

	
    public Assignment(String assignmentCode, Bus bus, Location location) {
        this.assignmentCode = assignmentCode;
        this.bus = bus;
        this.location = location;
    }
    public Assignment(String assignmentCode, Bus bus, Location location, String assignmentDay) {
       this.assignmentCode = assignmentCode;
       this.bus = bus;
       this.location = location;
       this.assignmentDay = assignmentDay;
    }
   
     @Id 

    
    @Column(name="ASSIGNMENT_CODE", unique=true, nullable=false, length=10)
    public String getAssignmentCode() {
        return this.assignmentCode;
    }
    
    public void setAssignmentCode(String assignmentCode) {
        this.assignmentCode = assignmentCode;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REGNO", nullable=false)
    public Bus getBus() {
        return this.bus;
    }
    
    public void setBus(Bus bus) {
        this.bus = bus;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LOCATIONID", nullable=false)
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }

    
    @Column(name="ASSIGNMENT_DAY", length=30)
    public String getAssignmentDay() {
        return this.assignmentDay;
    }
    
    public void setAssignmentDay(String assignmentDay) {
        this.assignmentDay = assignmentDay;
    }




}


