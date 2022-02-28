package uz.pdp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Bekjon Bakhromov
 * @created 18.02.2022-1:54 PM
 */
@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello >>>>>>>>>";
    }

    @GetMapping("/users")
    public ResponseEntity getUsers(Principal principal) {
        return ResponseEntity.ok(principal);
    }

}
