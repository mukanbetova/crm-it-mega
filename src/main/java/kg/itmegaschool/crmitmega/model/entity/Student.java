package kg.itmegaschool.crmitmega.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends BaseEntity {

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    LocalDate dob;

    @ManyToMany
    @JoinTable(
            name = "group_has_student",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
    List<Group> group;

}
