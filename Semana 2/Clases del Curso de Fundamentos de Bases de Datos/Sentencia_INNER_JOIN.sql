SELECT *
FROM usuarios
INNER JOIN posts ON usuarios.id = posts.usuario_id;