package medic.repository;

import lombok.AllArgsConstructor;
import medic.entity.Medic;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MedicRepositoryImpl implements MedicRepository{

    private DataSource dataSource;

    @Override
    public Medic[] findAll() {
        String sql = "SELECT * FROM medics";

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)){

            List<Medic> medics = new ArrayList<>();
            while (resultSet.next()){
                Medic medic = new Medic();
                medic.setNik(resultSet.getString("nik"));
                medic.setDescribe(resultSet.getString("describ"));

                medics.add(medic);
            }
            return medics.toArray(new Medic[]{});
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void add(Medic medic) {

        String sql = "INSERT INTO `medics`(`nik`, `describ`) VALUES (?,?)";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, medic.getNik());
            preparedStatement.setString(2, medic.getDescribe());
            preparedStatement.executeUpdate();

        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }

    }
}
