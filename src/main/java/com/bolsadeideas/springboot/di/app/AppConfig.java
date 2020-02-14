package com.bolsadeideas.springboot.di.app;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("Camara Sony", 1000);
        Producto producto2 = new Producto("Bici Bianchi aro 26", 20000);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto1 = new Producto("Laptop Asus", 800);
        Producto producto2 = new Producto("Impresora HP", 350);
        Producto producto3 = new Producto("Escritorio PC", 150);
        Producto producto4 = new Producto("Sillas", 80);

        ItemFactura linea1 = new ItemFactura(producto1, 30);
        ItemFactura linea2 = new ItemFactura(producto2, 3);
        ItemFactura linea3 = new ItemFactura(producto3, 15);
        ItemFactura linea4 = new ItemFactura(producto4, 35);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
