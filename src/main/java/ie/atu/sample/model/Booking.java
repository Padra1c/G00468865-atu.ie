package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String organiserName;

    @Id
    private Long roomId;

    public Booking(Long id, String organiserName, Long roomId) {
        this.id = id;
        this.organiserName = organiserName;
        this.roomId = roomId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrganiserName() { return organiserName; }
    public void setOrganiserName(String organiserName) { this.organiserName = organiserName; }

    public Long getRoomId() { return roomId; }
    public void setRoomId(Long roomId) { this.roomId = roomId; }

}
