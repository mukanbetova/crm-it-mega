package kg.itmegaschool.crmitmega.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddMentorRequest {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
}
