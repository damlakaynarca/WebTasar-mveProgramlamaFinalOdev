@RestController
public class RegisterController {

  // database bağlantısı için bir service sınıfı enjekte edin
  @Autowired
  private UserService userService;

  // post isteklerini /register adresinden alın
  @PostMapping("/register")
  public ResponseEntity<String> register(@RequestBody User user) {
    return null;
    // gelen user objesinin şifresi ile şifre onayı eşleşiyorsa}}
  }}