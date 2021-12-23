####### Proveedor.SQL
CREATE TABLE Proveedor (
  pv_id INT NOT NULL,
  pv_nombre VARCHAR(45) NOT NULL,
  pv_ciudad VARCHAR(45) NULL,
  pv_direccion VARCHAR(45) NULL,
  PRIMARY KEY (pv_id)
  );

INSERT INTO Proveedor (pv_id, pv_nombre, pv_ciudad, pv_direccion) VALUES (3345, 'Bayer', 'Bogota', 'fbis1');
INSERT INTO Proveedor (pv_id, pv_nombre, pv_ciudad, pv_direccion) VALUES (3346, 'Genfar', 'Medellin', 'fbis2');
INSERT INTO Proveedor (pv_id, pv_nombre, pv_ciudad, pv_direccion) VALUES (3347, 'Tecnoquimicas', 'Cali', 'fbis3');
INSERT INTO Proveedor (pv_id, pv_nombre, pv_ciudad, pv_direccion) VALUES (3348, 'Granero su grano', 'Salento', 'fbis4');
INSERT INTO Proveedor (pv_id, pv_nombre, pv_ciudad, pv_direccion) VALUES (3349, 'Nacional de dulces', 'Bogota', 'fbis5');


####### Producto.sql

CREATE TABLE Producto (
  pro_id INT NOT NULL,
  pro_nombre VARCHAR(45) NOT NULL,
  pro_precio DOUBLE NOT NULL,
  pro_marca VARCHAR(45) NOT NULL,
  pro_tipo VARCHAR(45) NULL,
  Proveedor_pv_id INT NOT NULL,
  pro_observaciones VARCHAR(100) NULL,
  PRIMARY KEY (pro_id),
  FOREIGN KEY (Proveedor_pv_id)
    REFERENCES Proveedor (pv_id)
   );

INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2100, 'acetaminofén', 12000, 'A', 'Medicamento', 3345, 'Caja por 20 tabletas');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2101, 'Arroz D&D', 35000, 'B', 'Alimento', 3348, 'Presentacion por 25 libras');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2102, 'Huevos mi gallina', 18000, 'C', 'Alimento', 3348, 'Panal por 30 unidades');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2103, 'Bombones de chocolate', 1500, 'D', 'Alimento', 3349, 'unidad');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2104, 'Vitamina c', 23500, 'E', 'Medicamento', 3345, 'Presentacion efervescente');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2105, 'Sorel loción', 35600, 'F', 'Medicamento', 3345, 'unidad');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2106, 'Bicarbonato de sodio', 4560, 'G', 'Medicamento', 3347, 'por 500 gr');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2107, 'Algodón', 3500, 'H', 'Medicamento', 3346, 'paquete');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2108, 'acetaminofén', 13500, 'I', 'Medicamento', 3346, 'por 500 miligramos');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2109, 'Vitamina c', 22600, 'J', 'Medicamento', 3347, 'por 100 ui');
INSERT INTO Producto (pro_id, pro_nombre, pro_precio, pro_marca, pro_tipo, Proveedor_pv_id, pro_observaciones) VALUES (2110, 'betametasona', 18900, 'K', 'Medicamento', 3347, 'Presentacion por 20 gr')

  
###### Cliente.sql  

CREATE TABLE Cliente (
  cl_id INT NOT NULL,
  cl_nombre VARCHAR(45) NOT NULL,
  cl_direccion VARCHAR(45) NULL,
  cl_telefono BIGINT(15) NULL,
  cl_barrio VARCHAR(50) NULL,
  PRIMARY KEY (cl_id)
);

INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (12333451, 'Julia María Castro', 'Calle A 234', 3016543624, 'las cruces');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (1112876321, 'Bernardo Gutierrez Martinez', 'Calle B 234', 3016543621, 'las nieves');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (29876543, 'Juan Esteban Mora', 'Calle C 234', 3016543622, 'los rosales');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (33876458, 'Lina Milena Ocampo', 'Calle D 234', 3016543623, 'la punta');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (22345765, 'Josefina Lopez Murillo', 'Calle F 234', 3016543625, 'la aldea');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (98765678, 'Samuel Siachoque Trochez', 'Calle G 234', 3016543626, 'la granja');
INSERT INTO Cliente (cl_id, cl_nombre, cl_direccion, cl_telefono, cl_barrio) VALUES (54322123, 'Carolina Aguado Velez', 'Calle H 234', 3016543627, 'la farma')

#########   Factura.sql

CREATE TABLE Factura (
  fac_id INT NOT NULL,
  Cliente_cl_id INT NOT NULL,
  Producto_pro_id INT NOT NULL,
  fac_fecha DATETIME NOT NULL,
  PRIMARY KEY (fac_id, Cliente_cl_id, Producto_pro_id),
  FOREIGN KEY (Cliente_cl_id) REFERENCES Cliente (cl_id),
  FOREIGN KEY (Producto_pro_id) REFERENCES Producto (pro_id)
);

INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1000, 2100, 29876543, '2020-10-25 20:00:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1004, 2105, 22345765, '2021-03-15 18:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1002, 2100, 29876543, '2021-03-17 15:30:20');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1005, 2101, 1112876321, '2021-05-20 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1005, 2102, 1112876321, '2021-05-20 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1002, 2102, 29876543, '2021-03-17 15:30:20');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1006, 2106, 33876458, '2021-06-22 21:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1002, 2105, 29876543, '2021-03-17 15:30:20');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1003, 2105, 54322123, '2021-01-20 20:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1007, 2103, 33876458, '2021-02-15 20:30:20');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1000, 2104, 29876543, '2020-10-25 20:00:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1008, 2103, 1112876321, '2021-05-21 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1008, 2102, 1112876321, '2021-05-21 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1009, 2110, 98765678, '2021-07-21 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1010, 2108, 98765678, '2021-06-21 11:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1011, 2109, 12333451, '2021-06-21 09:30:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1012, 2110, 98765678, '2021-06-22 12:20:00');
INSERT INTO Factura (fac_id, Producto_pro_id, Cliente_cl_id, fac_fecha) VALUES (1010, 2105, 98765678, '2021-06-21 11:30:00');

####### Modificaciones.sql

update Producto set pro_precio = pro_precio*1.15 where pro_tipo = 'Alimentos' ;
update Factura set fac_fecha = '2021-05-12 16:30:00' where fac_id = 1002;

####### Consultas.sql

select ' Consulta 1';
select distinct pro_nombre from Producto where pro_nombre like '%n';
select 'Consulta 2';
select Proveedor.pv_nombre, Producto.pro_nombre from Proveedor , Producto where Producto.Proveedor_pv_id = Proveedor.pv_id order by Producto.pro_id;
select 'Consulta 3';
select (SUM(Producto.pro_precio) + 13800) from Factura, Producto where Factura.Producto_pro_id = Producto.pro_id;
select 'Consulta 4';
select Cliente.cl_nombre , count(Producto.pro_id) from Producto, Factura, Cliente where Factura.Producto_pro_id = Producto.pro_id and Factura.Cliente_cl_id = Cliente.cl_id and Producto.pro_tipo like '%Medicamento%' group by Cliente.cl_nombre order by Cliente.cl_nombre asc ;


  
  
  
