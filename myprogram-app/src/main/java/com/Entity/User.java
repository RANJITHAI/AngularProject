public class User {
    import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructo;
    
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

    @GeneratedValue(strategy = GenerationType.AUTO)
@Id
    private long id;
    private final String name;
    private final String email;
    
    // standard constructors / setters / getters / toString
}