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
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="vutbus"
)
public class Student  implements java.io.Serializable {


     private String studentno;
     private Bus bus;
     private Employee employee;
     private String studentIdno;
     private String firstname;
     private String lastname;
     private String gender;
     private String telephoneNo;
     private Date dob;
     private String street;
     private String city;
     private String province;
     private String country;
     private Set<Payment> payments = new HashSet<Payment>(0);
     private Set<Ticket> tickets = new HashSet<Ticket>(0);

    public Student() {
    }

	
    public Student(String studentno, Bus bus, Employee employee, String studentIdno) {
        this.studentno = studentno;
        this.bus = bus;
        this.employee = employee;
        this.studentIdno = studentIdno;
    }
    public Student(String studentno, Bus bus, Employee employee, String studentIdno, String firstname, String lastname, String gender, String telephoneNo, Date dob, String street, String city, String province, String country, Set<Payment> payments, Set<Ticket> tickets) {
       this.studentno = studentno;
       this.bus = bus;
       this.employee = employee;
       this.studentIdno = studentIdno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.gender = gender;
       this.telephoneNo = telephoneNo;
       this.dob = dob;
       this.street = street;
       this.city = city;
       this.province = province;
       this.country = country;
       this.payments = payments;
       this.tickets = tickets;
    }
   
     @Id 

    
    @Column(name="STUDENTNO", unique=true, nullable=false, length=9)
    public String getStudentno() {
        return this.studentno;
    }
    
    public void setStudentno(String studentno) {
        this.studentno = studentno;
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
    @JoinColumn(name="EMPL_NO", nullable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    @Column(name="STUDENT_IDNO", nullable=false, length=20)
    public String getStudentIdno() {
        return this.studentIdno;
    }
    
    public void setStudentIdno(String studentIdno) {
        this.studentIdno = studentIdno;
    }

    
    @Column(name="FIRSTNAME", length=30)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="LASTNAME", length=30)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="GENDER", length=2)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="TELEPHONE_NO", length=10)
    public String getTelephoneNo() {
        return this.telephoneNo;
    }
    
    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DOB", length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="STREET", length=50)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="CITY", length=30)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="PROVINCE", length=25)
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

    
    @Column(name="COUNTRY", length=30)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="student")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="student")
    public Set<Ticket> getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }




}


