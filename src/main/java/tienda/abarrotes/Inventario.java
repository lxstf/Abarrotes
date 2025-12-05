package tienda.abarrotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    @Getter
    @Setter
    private int idInventario;

    @Getter @Setter
    private int existencias;

    @Getter @Setter
    private int idProducto;

}
