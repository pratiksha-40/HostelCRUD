package hostelproject.demohostel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;


import java.util.ArrayList;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wingsRoom")
@Getter
@Setter
public class WingRoom {

    

    @Id
   @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Room_ID")
private String Room_ID;
    @Column(name = "Room_Number")
    private int Room_Number;
    @Column(name = "Capacity")
    private int Capacity;
    @Column(name = "Occupied")
    private int Occupied;
  

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Wing_ID", referencedColumnName = "Wing_ID") 
    @JsonBackReference
    private Wings wing;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wingroom") 
    @JsonManagedReference
    private List<student> stulist = new ArrayList<>();

    public WingRoom() {
    }
    
    public WingRoom(String room_ID, int room_Number, int capacity, int occupied, Wings wing, List<student> stulist) {
        Room_ID = room_ID;
        Room_Number = room_Number;
        Capacity = capacity;
        Occupied = occupied;
        this.wing = wing;
        this.stulist = stulist;
    }
   
}
