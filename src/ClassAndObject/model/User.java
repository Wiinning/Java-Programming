package ClassAndObject.model;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor


public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;

}
