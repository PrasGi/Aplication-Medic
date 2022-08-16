package medic.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medic {

    @Size(min = 16, max = 16, message = "nik must be 16 char")
    @NotBlank(message = "nik cannot blank")
    private String nik;

    @Size(max = 255, message = "max char is 255")
    @NotBlank(message = "describe cannot blank")
    private String describe;

}
