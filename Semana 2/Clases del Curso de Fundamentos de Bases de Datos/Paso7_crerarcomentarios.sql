CREATE TABLE comentarios  (
   id int(11) NOT NULL,
   cuerpo_comentario text NOT NULL,
   usuario_id int(11) NOT NULL,
   post_id int(11) NOT NULL,
  PRIMARY KEY ( id ),
  KEY comentarios_usuario_idx  ( usuario_id ),
  KEY comentarios_post_idx  ( post_id ),
  CONSTRAINT comentarios_post  FOREIGN KEY ( post_id ) REFERENCES platziblog.posts  ( id ) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT comentarios_usuario  FOREIGN KEY ( usuario_id ) REFERENCES platziblog.usuarios  ( id ) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;