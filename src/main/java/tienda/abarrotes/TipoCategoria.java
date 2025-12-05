package tienda.abarrotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class TipoCategoria {

    @Getter @Setter
    private int idTipoCategoria;

    @Getter @Setter
    private String descripcion;
}
