package Model;
// Generated 24 Feb 2016 10:33:08 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ticket generated by hbm2java
 */
@Entity
@Table(name="ticket"
    ,catalog="vutbus"
)
public class Ticket  implements java.io.Serializable {


     private String ticketcode;
     private Student student;
     private String duration;
     private Date ticketDate;
     private Set<Payment> payments = new HashSet<Payment>(0);

    public Ticket() {
    }

	
    public Ticket(String ticketcode, Student student) {
        this.ticketcode = ticketcode;
        this.student = student;
    }
    public Ticket(String ticketcode, Student student, String duration, Date ticketDate, Set<Payment> payments) {
       this.ticketcode = ticketcode;
       this.student = student;
       this.duration = duration;
       this.ticketDate = ticketDate;
       this.payments = payments;
    }
   
     @Id 

    
    @Column(name="TICKETCODE", unique=true, nullable=false, length=15)
    public String getTicketcode() {
        return this.ticketcode;
    }
    
    public void setTicketcode(String ticketcode) {
        this.ticketcode = ticketcode;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STUDENTNO", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    
    @Column(name="DURATION", length=20)
    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TICKET_DATE", length=10)
    public Date getTicketDate() {
        return this.ticketDate;
    }
    
    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ticket")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }




}


