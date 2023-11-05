package com.example.springweb.service;

import com.example.springweb.enums.Department;
import com.example.springweb.enums.Gender;
import com.example.springweb.model.Personel;
import com.example.springweb.repository.PersonelRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PersonelServiceTest {

    @InjectMocks
    private PersonelService personelService;

    @Mock
    private PersonelRepository personelRepository;

    Personel personel;
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        personel = new Personel();
        personel.setId(1L);
        personel.setDepartment(Department.IT);
        personel.setMarried(false);
        personel.setGender(Gender.F);
        personel.setSalary(200D);
        personel.setSurname("java");
        personel.setFirstName("intelij");
    }

    @Test
    public void topla_should_return_sum_successfull() {
        //given
        int number1 = 3;
        int number2 = 5;

        //then
        int result = personelService.topla(number1, number2);

        //assert
        assertEquals(8, result);
    }

    @Test
    public void getPersonel_with_id_successful() {
        //given
        Long id = 1L;

        //then
        String result = personelService.getPersonel(id);

        //assert
        assertEquals("personel bulundu", result);

      //  assertNull(result);
    }

    @Test
    public void getPersonel_with_null_id_throw_error_fail() {

        //then
        Exception thrown =  Assertions.assertThrows(RuntimeException.class,
                () -> personelService.getPersonel(null));

        //assert
        assertEquals("personel bulunamadı", thrown.getMessage());
    }

    @Test
    public void savePersonel_test_successful() {

      /*  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Date birthdate = formatter.format(date);*/

        //given
        Personel savePersonel = new Personel();

        savePersonel.setDepartment(Department.IT);
        savePersonel.setMarried(false);
        savePersonel.setGender(Gender.M);
        savePersonel.setSalary(200D);
        savePersonel.setSurname("java");
        savePersonel.setFirstName("intelij");

        //when
        when(personelRepository.save(any())).thenReturn(personel);

        Personel result = personelService.savePersonel(savePersonel);
        System.out.println();
        assertEquals(personel.getGender(), result.getGender());
    }

    @Test
    public void getPersonelList_test_successful() {
        //given

        //then
        when(personelRepository.findAll()).thenReturn(Arrays.asList(personel));

        //then
        List<Personel> result = personelService.getPersonelList();

        //assert
        assertEquals(1, result.size());
        assertEquals(personel.getId(), result.get(0).getId());
        verify(personelRepository, Mockito.times(1)).findAll();
    }
}
