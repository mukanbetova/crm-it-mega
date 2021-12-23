package kg.itmegaschool.crmitmega.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_mentor")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mentor extends BaseEntity {

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    LocalDate dob;
    Double salary;
}
