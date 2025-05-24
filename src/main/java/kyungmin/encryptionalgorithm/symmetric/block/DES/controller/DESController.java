package kyungmin.encryptionalgorithm.symmetric.block.DES.controller;

import kyungmin.encryptionalgorithm.symmetric.block.DES.service.DESService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/des")
public class DESController {
  private final DESService service;


}
