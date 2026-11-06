package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BookingDTO {
    @NotNull
    private int roomId;

    @NotBlank
    private String bookingId;
}
