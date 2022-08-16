package medic;

import medic.repository.MedicRepository;
import medic.repository.MedicRepositoryImpl;
import medic.service.MedicService;
import medic.service.MedicServiceImpl;
import medic.util.DatabaseUtil;
import medic.view.MedicView;

import javax.sql.DataSource;

public class AplicationMedic {
    public static void main(String[] args) {
        DataSource dataSource = DatabaseUtil.getDatSource();
        MedicRepository medicRepository = new MedicRepositoryImpl(dataSource);
        MedicService medicService = new MedicServiceImpl(medicRepository);
        MedicView medicView = new MedicView(medicService);

        medicView.home();
    }
}
