package kyungmin.encryptionalgorithm.symmetric.block.DES.controller;

import kyungmin.encryptionalgorithm.symmetric.block.DES.service.DESService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/des")
public class DESController {
  private final DESService service;

  @PostMapping(value = "/create")
  public ResponseEntity<Void> create(@RequestParam(name = "phone") String phoneNumber) {
    service.create(phoneNumber);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value = "/get")
  public ResponseEntity<String> getPhoneNumber(@RequestParam(name = "id") String id) {
    return ResponseEntity.ok(service.getPhoneNumber(id));
  }
}
