package tp.person;

import  org.junit.jupiter.api.Test;
import tp.Appointment;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {
    private final Doctor doctor = new Doctor("1234", "john",
            "12341234", "3600@gmail.com");
    private final Patient patient = new Patient("1234", "sam",
            "12341234", "3600@gmail.com");
    String time = "2022-03-19T15:16:00";
    private final Appointment appointment = new Appointment(doctor, patient, LocalDateTime.parse(time));

    @Test
    void testToString() {
        assertEquals("Doctor: " + "john" + " || Patient: "
                             + "sam" + " || Appointment time: " + "2022-03-19T15:16:00", appointment.toString());
    }
}