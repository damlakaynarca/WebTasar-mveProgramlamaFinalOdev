$(document).ready(function() {
    // formu seç
    var form = $("form");
    // submit eventini yakala
    form.submit(function(event) {
      // formun varsayılan davranışını engelle
      event.preventDefault();
      // formdaki verileri al
      var firstName = $("#first-name").val();
      var email = $("#email").val();
      var password = $("#password").val();
      var confirmPassword = $("#confirm-password").val();
      // verileri bir objeye koy
      var data = {
        firstName: firstName,
        email: email,
        password: password,
        confirmPassword: confirmPassword
      };
      // Spring API'ye post isteği yap
      $.post("https://spring-api.com/register", data, function(response) {
        // istek başarılı olursa, response'u console.log ile göster
        console.log(response);
      });
    });
  });
  