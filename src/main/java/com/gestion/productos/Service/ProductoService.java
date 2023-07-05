package com.gestion.productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion.productos.Entity.Producto;
import com.gestion.productos.Repository.IProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private IProductoRepository iProductoRepository;

    //Para Listar los Productos
    public List<Producto>listAll(String palabraClave){
        if(palabraClave != null){
            return iProductoRepository.findAll(palabraClave);
        }
        return iProductoRepository.findAll();
    }

    //Para Guardar Productos
    public void save(Producto producto){
        iProductoRepository.save(producto);
    }

    //Para Obtener un solo Producto
    public Producto get(Long id){
        return iProductoRepository.findById(id).get();
    }

    //Para Eliminar Producto
    public void delete(Long id){
        iProductoRepository.deleteById(id);
    }
}
