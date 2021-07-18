CREATE TABLE usuarios (
  id int(11) NOT NULL,
  login varchar(30) NOT NULL,
  password varchar(32) NOT NULL,
  nickname varchar(40) NOT NULL,
  email varchar(40) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY email_UNIQUE (email)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
