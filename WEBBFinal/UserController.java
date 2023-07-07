import java.util.List;

@RestController
public class UserController {

  // database bağlantısı için bir service sınıfı enjekte edilecek
  @Autowired
  private UserService userService;

  // get isteklerini /users adresinden alın
  @GetMapping("/users")
  public ResponseEntity<List<User>> getUsers() {
    // database'den tüm kullanıcıları alın
    List<User> users = userService.getAllUsers();
    // kullanıcı listesini döndürün
    return ResponseEntity.ok(users);
  }
}
