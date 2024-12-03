package hostelproject.demohostel.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
public class student {
    @Id
   @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Student_ID")
 private  String Student_ID ;
 @Column(name ="name")
private String Name;
@Column(name ="Age")
private int Age;
@Column(name ="Gender")
private String Gender; 
@Column(name = "Phone_Number")
private int Phone_Number;
@Column(name="Email")
private String Email;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="Room_ID",referencedColumnName = "Room_ID")
@JsonBackReference
private WingRoom wingroom;


 
public student() {
}



public student(String student_ID, String name, int age, String gender, int phone_Number, String email) {
    Student_ID = student_ID;
    Name = name;
    Age = age;
    Gender = gender;
    Phone_Number = phone_Number;
    Email = email;
   
}



@Override
public String toString() {
    return "student [Student_ID=" + Student_ID + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender
            + ", Phone_Number=" + Phone_Number + ", Email=" + Email + "]";
}
    


}
