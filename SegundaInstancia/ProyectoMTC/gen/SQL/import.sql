INSERT INTO Empresa (id,nombre,direccion,email,telefono,descripcion,urlImagen,catalogo_id) VALUES (1,'Exito','Av 68 # 15 -56','exito@gmail.com','4567897','Supermercado Mayorista','http://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Almacenes_exito_logo.svg/1028px-Almacenes_exito_logo.svg.png',1);
INSERT INTO Catalogo (id,nombre) VALUES (1,'Catalogo de Productos');
INSERT INTO Categoria (id,nombre,catalogo_id) VALUES (1,'Comidas',1);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (1,'Jamon Pietran',12000,'http://www.elgranjamon.es/noticias/wp-content/uploads/2010/04/jamon-cocido.jpg','30%',1);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (2,'Queso Mozarella',8000,'http://www.ar.all.biz/img/ar/catalog/21620.jpeg','40%',1);
INSERT INTO Categoria (id,nombre,catalogo_id) VALUES (2,'Bebidas',1);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (3,'Jugo de Naranja',6500,'http://www.dietapaleo.org/wp-content/uploads/2013/03/jugo-de-naranja.jpg','30%',2);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (4,'Pepsi',4000,'http://www.oberholtzer-creative.com/visualculture/wp-content/uploads/2009/01/pepsi_can.jpg','70%',2);
INSERT INTO Categoria (id,nombre,catalogo_id) VALUES (3,'Ropa',1);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (5,'Camiseta Adidas',6500,'http://www.eblog.com.ar/wp-content/uploads/SelAlemana.jpg','25%',3);
INSERT INTO Producto (id,nombre,precio,imagen,promocion,categoria_id) VALUES (6,'Gorra Nike',4000,'http://images.nike.com/is/image/emea/PDP_HERO/Nike-FC-Block-True-Hat-648344_010_A.jpg','30%',3);
 