package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.controller;

import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.service.BlowfishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/blowfish")
public class BlowfishController {
  private final BlowfishService service;

}
