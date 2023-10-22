package com.example.springweb.service;

import com.example.springweb.model.Personel;
import com.example.springweb.repository.PersonelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonelService {

    private final PersonelRepository personelRepository;

/*    public PersonelService(PersonelRepository personelRepository) {
        this.personelRepository = personelRepository;
    }
    lombok kullandık.
*/
    public Personel savePersonel(Personel personel) {
        return personelRepository.save(personel);
    }

    public List<Personel> getPersonelList() {
        return personelRepository.findAll();
    }

    public Personel getPersonelById(Long id) {
        return personelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bu kullanıcı yok"));
    }

    public void deletePersonelById(Long id) {
        personelRepository.deleteById(id);
    }

    public Personel updatePersonelById(Personel personel) {
        return personelRepository.save(personel);
    }
}
