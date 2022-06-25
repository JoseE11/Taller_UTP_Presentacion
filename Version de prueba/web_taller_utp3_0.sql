-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2022 a las 23:20:38
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `web_taller_utp3.0`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id_citas` int(11) NOT NULL,
  `dni_tecnico` int(10) NOT NULL,
  `dni_cliente` int(10) NOT NULL,
  `hora_cita` varchar(150) NOT NULL,
  `fecha_cita` varchar(150) NOT NULL,
  `estado_cita` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_trabajo`
--

CREATE TABLE `detalle_trabajo` (
  `id_hoja_trabajo` int(11) NOT NULL,
  `id_servicio_util` int(11) NOT NULL,
  `id_pieza_util` int(11) NOT NULL,
  `descripcion_detalle_trabajo` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distritos`
--

CREATE TABLE `distritos` (
  `id_distrito` int(11) NOT NULL,
  `nombre_distrito` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `distritos`
--

INSERT INTO `distritos` (`id_distrito`, `nombre_distrito`) VALUES
(1, 'Socabaya'),
(2, 'Cercado'),
(3, 'JLBYR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `id_tipo_equipo` int(11) NOT NULL,
  `dni` int(10) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `estado_equipo` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoja_presupuesto`
--

CREATE TABLE `hoja_presupuesto` (
  `id_presupuesto` int(11) NOT NULL,
  `monto_presupuesto` varchar(45) NOT NULL,
  `descripcion_presupuesto` varchar(45) NOT NULL,
  `estado_presupuesto` int(11) NOT NULL DEFAULT 1,
  `id_equipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoja_trabajo`
--

CREATE TABLE `hoja_trabajo` (
  `id_hoja_trabajo` int(11) NOT NULL,
  `dni_tecnico` int(10) NOT NULL,
  `id_presupuesto` int(11) NOT NULL,
  `monto_total` int(150) NOT NULL,
  `dni_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `id_horario` int(11) NOT NULL,
  `nombre_horario` varchar(45) NOT NULL,
  `descripcion_horario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `horarios`
--

INSERT INTO `horarios` (`id_horario`, `nombre_horario`, `descripcion_horario`) VALUES
(1, 'Turno-Mañana', '8:00 am - 12:00 am'),
(2, 'Turno-Tarde', '12:00 am - 16:00 pm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `dni` int(10) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellido_paterno` varchar(45) NOT NULL,
  `apellido_materno` varchar(45) NOT NULL,
  `id_tipo_persona` int(11) NOT NULL,
  `id_distrito` int(11) DEFAULT NULL,
  `id_horario` int(11) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` int(10) NOT NULL,
  `correo_electronico` varchar(50) NOT NULL,
  `especialidad` varchar(45) DEFAULT NULL,
  `experiencia_laboral` varchar(100) DEFAULT NULL,
  `estado_persona` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`dni`, `nombres`, `apellido_paterno`, `apellido_materno`, `id_tipo_persona`, `id_distrito`, `id_horario`, `direccion`, `telefono`, `correo_electronico`, `especialidad`, `experiencia_laboral`, `estado_persona`) VALUES
(32131290, 'editado', 'gfdgfd', 'ÃÂÃÂ±opÃÂÃÂ±opÃÂÃÂ±', 1, NULL, 2, NULL, 6546456, 'fdsfsfdstecnico@fdsfsdf.com', 'computadoras', 'computadoras', 0),
(35424524, 'Josue', 'Quispe', 'Mamani', 3, NULL, NULL, NULL, 982739856, 'administrador@gmail.com', NULL, NULL, 1),
(73553465, 'Josue', 'Quispe', 'Robles', 2, 1, NULL, NULL, 87564544, 'cliente09238@gmail.com', NULL, NULL, 1),
(73578349, 'Pablito', 'Perez', 'Mamani', 1, NULL, 1, NULL, 913245345, 'tecnico@gmail.com', 'Celulares', 'Celulares Muela', 1),
(73579785, 'Juan', 'Quispe', 'Jon', 2, 1, NULL, 'casa 43B', 982739459, 'cliente098@gmail.com', NULL, NULL, 1),
(78653456, 'Editado2.0', 'perzzz', 'editado', 2, 1, NULL, 'peru 400D', 31242142, 'fdsfsfds@fdsfsdf.com', NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piezas`
--

CREATE TABLE `piezas` (
  `id_pieza` int(11) NOT NULL,
  `nombre_pieza` varchar(45) NOT NULL,
  `descripcion_pieza` varchar(11) NOT NULL,
  `estado_pieza` int(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piezas_util`
--

CREATE TABLE `piezas_util` (
  `id_equipo` int(11) NOT NULL,
  `id_pieza` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` int(11) NOT NULL,
  `nombre_rol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `id_servicio` int(11) NOT NULL,
  `nombre_servicio` varchar(45) NOT NULL,
  `descripcion_servicio` varchar(45) NOT NULL,
  `monto_servicio` int(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios_util`
--

CREATE TABLE `servicios_util` (
  `id_servicio` int(11) NOT NULL,
  `id_equipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_equipo`
--

CREATE TABLE `tipo_equipo` (
  `id_tipo_equipo` int(11) NOT NULL,
  `nombre_equipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_persona`
--

CREATE TABLE `tipo_persona` (
  `id_tipo_persona` int(11) NOT NULL,
  `nombre_tipo_persona` varchar(45) NOT NULL,
  `descripcion_tipo_persons` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_persona`
--

INSERT INTO `tipo_persona` (`id_tipo_persona`, `nombre_tipo_persona`, `descripcion_tipo_persons`) VALUES
(1, 'Tecnico', 'Tecnico_Taller'),
(2, 'Cliente', 'cliente_taller'),
(3, 'Administrador', 'Administrador_Taller');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id_citas`),
  ADD KEY `fk_tecnico_cita` (`dni_tecnico`),
  ADD KEY `fk_cliente_cita` (`dni_cliente`);

--
-- Indices de la tabla `detalle_trabajo`
--
ALTER TABLE `detalle_trabajo`
  ADD PRIMARY KEY (`id_hoja_trabajo`),
  ADD KEY `fk_pieza_trabajo` (`id_pieza_util`),
  ADD KEY `fk_servicio_trabajo` (`id_servicio_util`);

--
-- Indices de la tabla `distritos`
--
ALTER TABLE `distritos`
  ADD PRIMARY KEY (`id_distrito`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id_equipo`),
  ADD KEY `fk_equipo_DniCliente` (`dni`);

--
-- Indices de la tabla `hoja_presupuesto`
--
ALTER TABLE `hoja_presupuesto`
  ADD PRIMARY KEY (`id_presupuesto`),
  ADD KEY `fk_equipo_presupuesto` (`id_equipo`);

--
-- Indices de la tabla `hoja_trabajo`
--
ALTER TABLE `hoja_trabajo`
  ADD PRIMARY KEY (`id_hoja_trabajo`),
  ADD KEY `fk_tecnico_trabajo` (`dni_tecnico`),
  ADD KEY `fk_cliente_trabajo` (`dni_cliente`) USING BTREE,
  ADD KEY `fk_presupuesto_trabajo` (`id_presupuesto`);

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`id_horario`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `fk_distrito_persona` (`id_distrito`),
  ADD KEY `fk_horario_persona` (`id_horario`),
  ADD KEY `fk_tipo_persona` (`id_tipo_persona`);

--
-- Indices de la tabla `piezas`
--
ALTER TABLE `piezas`
  ADD PRIMARY KEY (`id_pieza`);

--
-- Indices de la tabla `piezas_util`
--
ALTER TABLE `piezas_util`
  ADD PRIMARY KEY (`id_equipo`),
  ADD KEY `fk_pieza_util` (`id_pieza`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id_servicio`);

--
-- Indices de la tabla `servicios_util`
--
ALTER TABLE `servicios_util`
  ADD PRIMARY KEY (`id_equipo`),
  ADD KEY `fk_servicio_util` (`id_servicio`);

--
-- Indices de la tabla `tipo_equipo`
--
ALTER TABLE `tipo_equipo`
  ADD PRIMARY KEY (`id_tipo_equipo`);

--
-- Indices de la tabla `tipo_persona`
--
ALTER TABLE `tipo_persona`
  ADD PRIMARY KEY (`id_tipo_persona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `id_citas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_trabajo`
--
ALTER TABLE `detalle_trabajo`
  MODIFY `id_hoja_trabajo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `distritos`
--
ALTER TABLE `distritos`
  MODIFY `id_distrito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hoja_presupuesto`
--
ALTER TABLE `hoja_presupuesto`
  MODIFY `id_presupuesto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hoja_trabajo`
--
ALTER TABLE `hoja_trabajo`
  MODIFY `id_hoja_trabajo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horarios`
--
ALTER TABLE `horarios`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `piezas`
--
ALTER TABLE `piezas`
  MODIFY `id_pieza` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `id_servicio` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_equipo`
--
ALTER TABLE `tipo_equipo`
  MODIFY `id_tipo_equipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_persona`
--
ALTER TABLE `tipo_persona`
  MODIFY `id_tipo_persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `fk_cliente_cita` FOREIGN KEY (`dni_cliente`) REFERENCES `persona` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tecnico_cita` FOREIGN KEY (`dni_tecnico`) REFERENCES `persona` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalle_trabajo`
--
ALTER TABLE `detalle_trabajo`
  ADD CONSTRAINT `fk_pieza_trabajo` FOREIGN KEY (`id_pieza_util`) REFERENCES `piezas_util` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_servicio_trabajo` FOREIGN KEY (`id_servicio_util`) REFERENCES `servicios_util` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `fk_equipo_DniCliente` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`),
  ADD CONSTRAINT `fk_tipo_equipo` FOREIGN KEY (`id_equipo`) REFERENCES `tipo_equipo` (`id_tipo_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `hoja_presupuesto`
--
ALTER TABLE `hoja_presupuesto`
  ADD CONSTRAINT `fk_equipo_presupuesto` FOREIGN KEY (`id_equipo`) REFERENCES `equipo` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `hoja_trabajo`
--
ALTER TABLE `hoja_trabajo`
  ADD CONSTRAINT `fk_cliente_trabajo` FOREIGN KEY (`dni_cliente`) REFERENCES `persona` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_presupuesto_trabajo` FOREIGN KEY (`id_presupuesto`) REFERENCES `hoja_presupuesto` (`id_presupuesto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tecnico_trabajo` FOREIGN KEY (`dni_tecnico`) REFERENCES `persona` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_distrito_persona` FOREIGN KEY (`id_distrito`) REFERENCES `distritos` (`id_distrito`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_horario_persona` FOREIGN KEY (`id_horario`) REFERENCES `horarios` (`id_horario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tipo_persona` FOREIGN KEY (`id_tipo_persona`) REFERENCES `tipo_persona` (`id_tipo_persona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `piezas_util`
--
ALTER TABLE `piezas_util`
  ADD CONSTRAINT `fk_pieza_util` FOREIGN KEY (`id_pieza`) REFERENCES `piezas` (`id_pieza`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `servicios_util`
--
ALTER TABLE `servicios_util`
  ADD CONSTRAINT `fk_servicio_util` FOREIGN KEY (`id_servicio`) REFERENCES `servicios` (`id_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
