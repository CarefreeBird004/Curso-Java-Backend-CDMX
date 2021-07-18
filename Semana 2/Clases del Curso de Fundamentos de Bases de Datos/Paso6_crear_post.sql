
CREATE TABLE posts  (
   id int(11) NOT NULL,
   titulo varchar(130) NOT NULL,
   fecha_publicacion  timestamp NULL DEFAULT NULL,
   contenido text NOT NULL,
   estatus char(8) DEFAULT'activo',
   usuario_id int(11) DEFAULT NULL,
   categoria_id int(11) DEFAULT NULL,
  PRIMARY KEY ( id ),
  KEY posts_usuarios_idx  ( usuario_id ),
  KEY posts_categorias_idx  ( categoria_id ),
  CONSTRAINT posts_categorias  FOREIGN KEY ( categoria_id ) REFERENCES platziblog.categorias  ( id ) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT posts_usuarios  FOREIGN KEY ( usuario_id ) REFERENCES platziblog.usuarios  ( id ) ON DELETE NO ACTION ON UPDATE CASCADE
  ) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4;
