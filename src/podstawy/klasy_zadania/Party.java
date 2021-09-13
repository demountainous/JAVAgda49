package podstawy.klasy_zadania;

import java.util.Arrays;

public class Party {
    private final Person host;
    private final Person[] attendees;

    public Party(Person host, Person[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    public Person getHost() {
        return host;
    }

    public Person[] getAttendees() {
        return attendees;
    }

    public double getAverageAge() {
        int wiekSuma = 0;
        for (Person person : attendees) {
            wiekSuma += person.getAge();
        }
        return wiekSuma / attendees.length;
    }

    public double getAverageAgeStream() {
        return Arrays.stream(attendees)
                .mapToDouble(Person::getAge)
                .average()
                .orElseThrow(RuntimeException::new);
    }

}
