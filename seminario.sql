CREATE SCHEMA IF NOT EXISTS `seminario_db` DEFAULT CHARACTER SET utf16 COLLATE utf16_spanish2_ci;
-- -----------------------------------------------------
-- Schema seminario_db
-- -----------------------------------------------------
USE `seminario_db` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuarioNombre` VARCHAR(45) NOT NULL,
  `usuarioApellido` VARCHAR(45) NOT NULL,
  `usuarioTipoDocumento` INT NOT NULL,
  `usuarioNumeroDocumento` INT NOT NULL,
  `usuarioNumeroContacto` INT NOT NULL,
  `usuarioCorreo` VARCHAR(45) NOT NULL,
  `usuarioContrasena` VARCHAR(45) NOT NULL,
  CONSTRAINT `cons_PK_usuario` PRIMARY KEY (`id`),
  CONSTRAINT `cons_UK_usuarioNumeroDocumento` UNIQUE (`usuarioNumeroDocumento`),
  INDEX `usuarioNombre_index` (`usuarioNombre` ASC),
  INDEX `usuarioApellido_index` (`usuarioApellido` ASC),
  INDEX `usuarioNumeroDocumento_index` (`usuarioNumeroDocumento` ASC),
  INDEX `usuarioNumeroContacto_index` (`usuarioNumeroContacto` ASC),
  INDEX `usuarioCorreo_index` (`usuarioCorreo` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`conductor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`conductor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `conductorNombre` VARCHAR(45) NOT NULL,
  `conductorApellido` VARCHAR(45) NOT NULL,
  `conductorTipoDocumento` INT NOT NULL,
  `conductorNumeroDocumento` INT NOT NULL,
  `conductorNumeroContacto` INT NOT NULL,
  CONSTRAINT `cons_PK_conductor` PRIMARY KEY (`id`),
  CONSTRAINT `cons_UK_conductorNumeroDocumento` UNIQUE (`conductorNumeroDocumento`),
  INDEX `conductorNombre_index` (`conductorNombre` ASC),
  INDEX `conductorApellido_index` (`conductorApellido` ASC),
  INDEX `conductorNumeroDocumento_index` (`conductorNumeroDocumento` ASC),
  INDEX `conductorNumeroContacto_index` (`conductorNumeroContacto` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`tipoInfraccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`tipoInfraccion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigoInfraccion` INT NOT NULL,
  `tipoInfraccion` VARCHAR(45) NOT NULL,
  `valorInfraccion` INT NOT NULL,
  CONSTRAINT `cons_PK_tipoInfraccion` PRIMARY KEY (`id`),
  INDEX `codigoInfraccion_index` (`codigoInfraccion` ASC),
  INDEX `tipoInfraccion_index` (`tipoInfraccion` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`tipoVehiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`tipoVehiculo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipoVehiculo` VARCHAR(45) NOT NULL,
  CONSTRAINT `cons_PK_tipoVehiculo` PRIMARY KEY (`id`),
  INDEX `tipoVehiculo_index` (`tipoVehiculo` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`vehiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`vehiculo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(6) NOT NULL,
  `tipoVehiculo_id` INT NOT NULL,
  CONSTRAINT `cons_PK_vehiculo` PRIMARY KEY (`id`),
  CONSTRAINT `cons_UK_vehiculo_placa` UNIQUE (`placa`),
  FOREIGN KEY (`tipoVehiculo_id`) REFERENCES `tipoVehiculo`(`id`),
  INDEX `placa_index` (`placa` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`estado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `estado` VARCHAR(45) NOT NULL,
  `seProcesa` INT NOT NULL,
  CONSTRAINT `cons_PK_estado` PRIMARY KEY (`id`),
  CONSTRAINT `cons_UK_estado_estado` UNIQUE (`estado`),
  INDEX `estado_index` (`estado` ASC)
);

-- -----------------------------------------------------
-- Table `mydb`.`infraccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seminario_db`.`infraccion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `conductor_id` INT NOT NULL,
  `tipoInfraccion_id` INT NOT NULL,
  `vehiculo_id` INT NOT NULL,
  `estado_id` INT NOT NULL,
  `fecha` DATETIME NOT NULL,
  `agente_id` INT NOT NULL,
  `usuario_id` INT NOT NULL,
  CONSTRAINT `cons_PK_infraccion` PRIMARY KEY (`id`),
  FOREIGN KEY (`conductor_id`) REFERENCES `conductor`(`id`),
  FOREIGN KEY (`tipoInfraccion_id`) REFERENCES `tipoInfraccion`(`id`),
  FOREIGN KEY (`vehiculo_id`) REFERENCES `vehiculo`(`id`),
  FOREIGN KEY (`estado_id`) REFERENCES `estado`(`id`),
  FOREIGN KEY ('agente_id') REFERENCES `usuario`(`id`),
  FOREIGN KEY (`usuario_id`) REFERENCES `usuario`('id')
);