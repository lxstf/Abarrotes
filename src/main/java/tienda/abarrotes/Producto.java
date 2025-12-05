package tienda.abarrotes;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Getter @Setter
    private int idProducto;

    @Getter @Setter
    private String nombreProducto;

    @Getter @Setter
    private String marcaProducto;

    @Getter @Setter
    private int idTipoCategoria;

    @Getter @Setter
    private float precio;


}
