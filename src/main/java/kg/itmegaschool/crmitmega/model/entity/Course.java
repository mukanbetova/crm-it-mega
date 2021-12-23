package kg.itmegaschool.crmitmega.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_course")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity {

    @Column(name = "course_name", nullable = false)
    String courseName;

    @Column(name = "monthly_cost", nullable = false)
    Double monthlyCost;

    @ManyToOne
    @JoinColumn(name = "course_type_id", referencedColumnName = "id", nullable = false)
    CourseType courseType;

}
