package medic.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.AllArgsConstructor;
import medic.entity.Medic;
import medic.repository.MedicRepository;

import java.util.Set;

public class MedicServiceImpl implements MedicService{

    private MedicRepository medicRepository;
    public MedicServiceImpl(MedicRepository medicRepository) {
        this.medicRepository = medicRepository;
    }
    private static MedicDao medicDao = new MedicDaoImpl();
    private static MedicHeadache medicHeadache = new MedicHeadacheImpl();

    public static boolean findDiagnose(String value){
        if (medicDao.analityc(value) == 1) {
            System.out.println(medicHeadache.tension());;
            return true;
        }else if(medicDao.analityc(value) == 2){
            System.out.println(medicHeadache.cluster());
            return true;
        }else if(medicDao.analityc(value) == 3){
            System.out.println(medicHeadache.migraine());
            return true;
        }else if(medicDao.analityc(value) == 4){
            System.out.println(medicHeadache.vertigo());
            return true;
        }else if(medicDao.analityc(value) == 5){
            System.out.println("\nTerdapat ketidak cocokan dalam deskripsi anda, disarankan untuk segera kedokter untuk mendapatkan penjelasan mendetail tentang penyakit kepala anda");
            return false;
        }else if(medicDao.analityc(value) == 9){
            System.out.println("\nmohon masukan gejala yang anda alami");
            return false;
        }else if(medicDao.analityc(value) == 8){
            System.out.println("\nmohon memasukan bagian kepala yang bermasalah");
            return false;
        }else if(medicDao.analityc(value) == 0){
            System.out.println("\nmohon masukan bagian kepala yang bermasalah dan gejala yang dialami");
            return false;
        }else{
            System.out.println("eror nilai dao");
            return false;
        }
    }

    /**
     *  Validator
     */
    private ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private Validator validator = validatorFactory.getValidator();

    @Override
    public void getDiagnose(String nik, String describe) {

        Medic medic = new Medic(nik, describe);

        Set<ConstraintViolation<Medic>> violations = validator.validate(medic);

        if (violations.size() >0){
            for (ConstraintViolation<Medic> violation :violations) {
                System.out.println("\n"+violation.getMessage());
            }
        }else {
            if (findDiagnose(describe)){
                medicRepository.add(medic);
            }
        }

    }

    @Override
    public void showHistory() {
        Medic[] medic = medicRepository.findAll();
        System.out.println("===== HISTORY =====");

        for(var value : medic){
            System.out.println(value.getNik()+" \t||\t "+value.getDescribe());
        }
    }
}
