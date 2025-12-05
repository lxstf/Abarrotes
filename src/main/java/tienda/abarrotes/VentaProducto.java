package tienda.abarrotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class VentaProducto {

    @Getter @Setter
    private int idProductoVenta;

    @Getter @Setter
    private int idProducto;

    @Getter @Setter
    private int idVenta;

    @Getter
    @Setter
    private int cantidad;
}
