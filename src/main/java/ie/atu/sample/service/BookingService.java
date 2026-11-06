package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepo;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepo bookingRepo;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepo bookingRepo, RoomRepository roomRepository) {
        this.bookingRepo = bookingRepo;
        this.roomRepository = roomRepository;
    }

    public Booking createBooking(Booking booking){
        Room room = RoomRepository.findById();
    }

    if() {
        throw new RuntimeException("Booking not found");
    }

    public RoomRepository getRoomRepository() {
        return roomRepository;
    }
}
