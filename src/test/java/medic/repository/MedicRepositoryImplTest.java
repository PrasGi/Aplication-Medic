package medic.repository;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import medic.entity.Medic;
import medic.util.DatabaseUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicRepositoryImplTest {

    private HikariDataSource dataSource;

    private MedicRepository medicRepository;

    @BeforeEach
    void setUp(){
        dataSource = DatabaseUtil.getDatSource();
        medicRepository = new MedicRepositoryImpl(dataSource);
    }

    @Test
    void testFindAll(){
        medicRepository.add(new Medic("1231234134","gergergrweg"));
        medicRepository.add(new Medic("524542423","coba lagi"));

        Medic[] medic = medicRepository.findAll();
        for(var value : medic){
            System.out.println(value.getNik()+" \t||\t "+value.getDescribe());
        }
    }

    @Test
    void testAdd() {
        Medic medic = new Medic();
        medic.setNik("1161040104040001");
        medic.setDescribe("anda mempunyai gejala eskrim fungsion");

        medicRepository.add(medic);
    }

    @Test
    void testVlidator() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Assertions.assertNotNull(validator);

        validatorFactory.close();
    }

    @AfterEach
    void afterAll() {
        dataSource.close();
    }
}
