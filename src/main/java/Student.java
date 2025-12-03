import lombok.*;

//@NoArgsConstructor //Generate default constructor (static fields are not initialized)
@AllArgsConstructor(access = AccessLevel.PRIVATE)//Generate a constructor with one parameter for each field in a class (static and final fields are not initialized or generate cons arg for them)
@Data
//@RequiredArgsConstructor //Generate a constructor required argument field (final)
//@Getter
//@Setter
//@EqualsAndHashCode
public class Student {
    private String firstName;
    private String lastName;
    private String useName;
    private String email;
    private String password;
    private String confirmPassword;
   // private final String age;

}
