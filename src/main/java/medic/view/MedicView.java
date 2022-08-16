package medic.view;

import lombok.AllArgsConstructor;
import medic.service.MedicService;
import medic.util.InputUtil;

@AllArgsConstructor
public class MedicView {

    private MedicService medicService;

    public void home(){
        while (true){
            System.out.println("\n===== WELCOME TO MEDIC =====");
            System.out.println("1. find Headache");
            System.out.println("2. Show history");
            System.out.println("x. Out");

            var input = InputUtil.input("Input chose");

            if (input.equals("1")){
                diagnose();
            } else if (input.equals("2")) {
                medicService.showHistory();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("miss number!!!");
            }
        }

    }

    public void diagnose(){
        var nik = InputUtil.input("Input nik");
        var describe = InputUtil.input("Describe your headache");

        medicService.getDiagnose(nik, describe);
    }

}
