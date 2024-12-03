package hostelproject.demohostel.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wings")
@Getter
@Setter

public class Wings {
 
  @Id
@GeneratedValue(strategy = GenerationType.UUID)
   @Column(name = "Wing_ID")
   private String wing_Id;

   @Column(name = "Wing_Name")
   private String wing_Name;
   @Column(name = "Gender_Allowed")
   private String gender_Allowed;

   @Column(name = "Capacity")
   private int capacity;

   @Column(name = "Occupied")
   private int occupied;

   @Column(name = "Room_ID")
   private String roomId;
   @OneToMany( mappedBy = "wing")
   @JsonManagedReference
   private List<WingRoom> wingRooms ;

    public Wings(String wing_Id, String wing_Name, String gender_Allowed, int capacity, int occupied, String roomId,
        List<WingRoom> wingRooms) {
      this.wing_Id = wing_Id;
      this.wing_Name = wing_Name;
      this.gender_Allowed = gender_Allowed;
      this.capacity = capacity;
      this.occupied = occupied;
      this.roomId = roomId;
      this.wingRooms = wingRooms;
    }
    public Wings() {
    }
}
