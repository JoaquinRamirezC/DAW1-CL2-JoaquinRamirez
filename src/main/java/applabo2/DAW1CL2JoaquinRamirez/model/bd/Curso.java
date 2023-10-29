package applabo2.DAW1CL2JoaquinRamirez.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.text.DecimalFormat;

@Entity
@Table (name = "Farmaco")
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfarmaco;

    @Column(name = "nomfarmaco")
    private String nomfarmaco;

    private DecimalFormat precio;

}
