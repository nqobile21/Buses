package Model;
// Generated 24 Feb 2016 10:33:08 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name="payment"
    ,catalog="vutbus"
)
public class Payment  implements java.io.Serializable {


     private String paymentid;
     private Employee employee;
     private Student student;
     private Ticket ticket;
     private Date paymentDate;
     private String paymentTime;
     private Double amountDue;
     private Double amountPayed;
     private String paymentType;

    public Payment() {
    }

	
    public Payment(String paymentid, Employee employee, Student student, Ticket ticket) {
        this.paymentid = paymentid;
        this.employee = employee;
        this.student = student;
        this.ticket = ticket;
    }
    public Payment(String paymentid, Employee employee, Student student, Ticket ticket, Date paymentDate, String paymentTime, Double amountDue, Double amountPayed, String paymentType) {
       this.paymentid = paymentid;
       this.employee = employee;
       this.student = student;
       this.ticket = ticket;
       this.paymentDate = paymentDate;
       this.paymentTime = paymentTime;
       this.amountDue = amountDue;
       this.amountPayed = amountPayed;
       this.paymentType = paymentType;
    }
   
     @Id 

    
    @Column(name="PAYMENTID", unique=true, nullable=false, length=12)
    public String getPaymentid() {
        return this.paymentid;
    }
    
    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMPL_NO", nullable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STUDENTNO", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TICKETCODE", nullable=false)
    public Ticket getTicket() {
        return this.ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="PAYMENT_DATE", length=10)
    public Date getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
    @Column(name="PAYMENT_TIME", length=12)
    public String getPaymentTime() {
        return this.paymentTime;
    }
    
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    
    @Column(name="AMOUNT_DUE", precision=7)
    public Double getAmountDue() {
        return this.amountDue;
    }
    
    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    
    @Column(name="AMOUNT_PAYED", precision=7)
    public Double getAmountPayed() {
        return this.amountPayed;
    }
    
    public void setAmountPayed(Double amountPayed) {
        this.amountPayed = amountPayed;
    }

    
    @Column(name="PAYMENT_TYPE", length=10)
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }




}

