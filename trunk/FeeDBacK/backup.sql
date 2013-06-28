/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE asignacionfamiliar (
  idasignacion int(10) NOT NULL AUTO_INCREMENT,
  monto varchar(15) DEFAULT NULL,
  requisito varchar(15) DEFAULT NULL,
  PRIMARY KEY (idasignacion)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE cargo (
  idcargo int(3) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) DEFAULT NULL,
  sueldo varchar(30) DEFAULT NULL,
  PRIMARY KEY (idcargo)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO cargo (idcargo, nombre, sueldo) VALUES (1,'Administrador','0'),(2,'Administrativo Recursos Humanos','450000'),(3,'Empleado','0');
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE liquidacion (
  rut varchar(12) NOT NULL DEFAULT '',
  mes varchar(2) NOT NULL,
  año varchar(4) NOT NULL,
  ncargafamiliar varchar(2) DEFAULT NULL,
  valorcargafamiliar varchar(15) DEFAULT NULL,
  valorprevision varchar(15) DEFAULT NULL,
  totalprevision varchar(15) DEFAULT NULL,
  valorsalud varchar(15) DEFAULT NULL,
  totalsalud varchar(15) DEFAULT NULL,
  sueldobase varchar(15) DEFAULT NULL,
  ndiastrabajados varchar(2) DEFAULT NULL,
  valordiastrabajados varchar(15) DEFAULT NULL,
  nhorasextras varchar(2) DEFAULT NULL,
  valorhorasextras varchar(15) DEFAULT NULL,
  gratificacion varchar(15) DEFAULT NULL,
  bono varchar(15) DEFAULT NULL,
  comision varchar(15) DEFAULT NULL,
  movilizacion varchar(15) DEFAULT NULL,
  colacion varchar(15) DEFAULT NULL,
  scesantia varchar(15) DEFAULT NULL,
  anticipos varchar(15) DEFAULT NULL,
  idprestamo int(10) DEFAULT NULL,
  tnoimponible varchar(15) DEFAULT NULL,
  timponible varchar(15) DEFAULT NULL,
  tdescuentos varchar(15) DEFAULT NULL,
  liquidonumero varchar(15) DEFAULT NULL,
  liquidoletras varchar(250) DEFAULT NULL,
  PRIMARY KEY (rut,mes,año),
  KEY idprestamo (idprestamo),
  CONSTRAINT liquidacion_ibfk_1 FOREIGN KEY (rut) REFERENCES trabajador (ruttrabajador),
  CONSTRAINT liquidacion_ibfk_2 FOREIGN KEY (idprestamo) REFERENCES prestamo (idprestamo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE parametros (
  mes varchar(2) NOT NULL,
  año varchar(4) NOT NULL,
  nombre varchar(50) NOT NULL,
  valor varchar(15) DEFAULT NULL,
  PRIMARY KEY (nombre,mes,año)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE prestamo (
  idprestamo int(10) NOT NULL AUTO_INCREMENT,
  ruttrabajador varchar(12) DEFAULT NULL,
  mes varchar(2) DEFAULT NULL,
  año varchar(4) DEFAULT NULL,
  monto varchar(10) DEFAULT NULL,
  numerocuotas varchar(2) DEFAULT NULL,
  valorcuota varchar(10) DEFAULT NULL,
  PRIMARY KEY (idprestamo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE prevision (
  mes varchar(2) NOT NULL,
  año varchar(4) NOT NULL,
  nombre varchar(50) NOT NULL,
  valor varchar(15) DEFAULT NULL,
  PRIMARY KEY (nombre,mes,año)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO prevision (mes, año, nombre, valor) VALUES ('1','2013','Cuprum','11.98%'),('2','2013','Cuprum','11.99%'),('0','2013','habitad','11.7%'),('1','2013','habitad',''),('2','2013','JAJAJAJ','7%'),('1','2013','provida','10.98%');
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE salud (
  mes varchar(2) NOT NULL,
  año varchar(4) NOT NULL,
  nombre varchar(50) NOT NULL,
  valor varchar(15) DEFAULT NULL,
  PRIMARY KEY (nombre,mes,año)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO salud (mes, año, nombre, valor) VALUES ('1','2013','Salud','7%');
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE trabajador (
  ruttrabajador varchar(12) NOT NULL DEFAULT '',
  nombre varchar(50) DEFAULT NULL,
  paterno varchar(50) DEFAULT NULL,
  materno varchar(50) DEFAULT NULL,
  idcargo int(3) DEFAULT NULL,
  nombresalud varchar(50) DEFAULT NULL,
  nombreprevision varchar(50) DEFAULT NULL,
  fechaingreso varchar(15) DEFAULT NULL,
  tipocontrato varchar(50) DEFAULT NULL,
  ncargafamiliar varchar(5) DEFAULT NULL,
  sueldobase varchar(10) DEFAULT NULL,
  direccion varchar(100) DEFAULT NULL,
  telefono varchar(10) DEFAULT NULL,
  email varchar(40) DEFAULT NULL,
  clave varchar(30) DEFAULT NULL,
  estado varchar(30) DEFAULT NULL,
  PRIMARY KEY (ruttrabajador),
  KEY idcargo (idcargo),
  KEY nombresalud (nombresalud),
  KEY nombreprevision (nombreprevision),
  CONSTRAINT trabajador_ibfk_1 FOREIGN KEY (idcargo) REFERENCES cargo (idcargo),
  CONSTRAINT trabajador_ibfk_2 FOREIGN KEY (nombresalud) REFERENCES salud (nombre),
  CONSTRAINT trabajador_ibfk_3 FOREIGN KEY (nombreprevision) REFERENCES prevision (nombre)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO trabajador (ruttrabajador, nombre, paterno, materno, idcargo, nombresalud, nombreprevision, fechaingreso, tipocontrato, ncargafamiliar, sueldobase, direccion, telefono, email, clave, estado) VALUES ('123','Administrador','Sistema','',1,NULL,NULL,NULL,NULL,NULL,NULL,'Ejercito 200','569282828',NULL,'123',NULL),('172132332','Cristian Esteban','Pardo','Velásquez',3,'Salud','habitad','1-1-2012','Definido','0','350000','Pedro Aguirre Cerda 300','72046352','cepardov@gmail.com','123',NULL);

