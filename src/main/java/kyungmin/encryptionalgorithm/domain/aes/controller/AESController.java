package kyungmin.encryptionalgorithm.domain.aes.controller;

import kyungmin.encryptionalgorithm.domain.aes.service.AESService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/aes")
public class AESController {
  private final AESService aesService;

  @GetMapping(value = "/create")
  public ResponseEntity<Void> create(@RequestParam(name = "phone") String phoneNumber) {
    aesService.create(phoneNumber);
    return ResponseEntity.ok().build();
  }

  @GetMapping("/get")
  public ResponseEntity<String> getPhoneNumber(@RequestParam(name = "id") String id) {
    return ResponseEntity.ok(aesService.getPhoneNumber(id));
  }
}
