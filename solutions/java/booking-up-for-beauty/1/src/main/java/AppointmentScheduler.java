import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, formatter);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime current = LocalDateTime.now();
        return appointmentDate.isBefore(current);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18){
            return true;
        } else {
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // dayname, month day, year, at hour, minute PM.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
        return dtf.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(),9,15);
    }
}
