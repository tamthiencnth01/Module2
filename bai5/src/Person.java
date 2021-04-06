import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private LocalDate birthDate;
    private LocalDate currentDate;

    public Person() {
    }

    public Person(LocalDate birthDate, LocalDate currentDate) {
        this.birthDate = birthDate;
        this.currentDate = currentDate;
    }

    public int calculator(LocalDate birthDate,
                          LocalDate currentDate){
//        int year = Calendar.getInstance().get(Calendar.YEAR);
//
//        return year - this.dob.getYear();

            // validate inputs ...
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;
        return age;
    }
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.calculator(new Date(1993,10,16),));
    }
}

