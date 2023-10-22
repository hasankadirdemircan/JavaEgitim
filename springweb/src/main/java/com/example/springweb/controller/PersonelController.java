package com.example.springweb.controller;

import com.example.springweb.model.Personel;
import com.example.springweb.service.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personel")
@RequiredArgsConstructor
public class PersonelController {

    private final PersonelService personelService;

    @PostMapping("/save")
    public Personel savePersonel(@Validated @RequestBody Personel personel) {
        System.out.println("-----");
       return personelService.savePersonel(personel);
    }

    @GetMapping
    public List<Personel> getPersonelList() {
        return personelService.getPersonelList();
    }

    @GetMapping("/{id}")
    public Personel getPersonelById(@PathVariable(value = "id") Long id) {
        return personelService.getPersonelById(id);
    }

    @GetMapping("/query")
    public Personel getPersonelByIdRequestParam(@RequestParam(value = "id") Long id,
                                                @RequestParam(value = "name") String firstName) {
        return personelService.getPersonelById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deletePersonelById(@PathVariable(value = "id") Long id) {
        personelService.deletePersonelById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Personel> updatePersonelById(@Validated @RequestBody Personel personel) {
        Personel updatedPersonel = personelService.updatePersonelById(personel);
        return new ResponseEntity<>(updatedPersonel, HttpStatus.OK);
    }
}
