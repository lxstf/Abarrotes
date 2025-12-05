package tienda.abarrotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Venta {

    @Getter
    @Setter
    private int idVenta;

    @Getter @Setter
    private Date fechaPago;

    @Getter @Setter
    private String metodoPago;

    @Getter @Setter
    private int cantidadProducto;

    private List<Producto> productos = new ArrayList<>();

}
