-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2022 a las 07:04:35
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `web_taller_utp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id_cita` varchar(11) NOT NULL,
  `dni_cliente` varchar(8) NOT NULL,
  `dni_tecnico` varchar(8) NOT NULL,
  `hora_cita` time NOT NULL,
  `fecha_cita` date NOT NULL,
  `estado_cita` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_trabajo`
--

CREATE TABLE `detalle_trabajo` (
  `id_hoja_trabajo` varchar(11) NOT NULL,
  `id_servicio` varchar(11) NOT NULL,
  `id_pieza` varchar(11) NOT NULL,
  `descripción_detalle_trabajo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distritos`
--

CREATE TABLE `distritos` (
  `id_distrito` varchar(11) NOT NULL,
  `nombre_distrito` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` varchar(11) NOT NULL,
  `id_tipo_equipo` varchar(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `estado_equipo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoja_presupuesto`
--

CREATE TABLE `hoja_presupuesto` (
  `id_presupuesto` varchar(11) NOT NULL,
  `monto_presupuesto` double NOT NULL,
  `descripcion_presupuesto` int(255) NOT NULL,
  `estado_presupuesto` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoja_trabajo`
--

CREATE TABLE `hoja_trabajo` (
  `id_hoja_trabajo` varchar(11) NOT NULL,
  `dni_tecnico` varchar(8) NOT NULL,
  `dni_cliente` varchar(8) NOT NULL,
  `id_presupuesto` varchar(11) NOT NULL,
  `monto_total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `id_horario` varchar(11) NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `dni` varchar(8) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellido_paterno` varchar(50) NOT NULL,
  `apellido_materno` varchar(50) NOT NULL,
  `id_tipo_persona` varchar(11) NOT NULL,
  `id_distrito` varchar(11) NOT NULL,
  `id_horario` varchar(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` int(15) NOT NULL,
  `correo_electronico` varchar(50) NOT NULL,
  `especialidad` varchar(255) NOT NULL,
  `experiencia_laboral` varchar(255) NOT NULL,
  `estado_persona` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piezas`
--

CREATE TABLE `piezas` (
  `id_pieza` varchar(11) NOT NULL,
  `nombre_pieza` varchar(45) NOT NULL,
  `descripcion_pieza` varchar(255) NOT NULL,
  `estado_pieza` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` varchar(11) NOT NULL,
  `nombre_rol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `id_servicio` varchar(11) NOT NULL,
  `nombre_servicio` varchar(45) NOT NULL,
  `descripcion_servicio` varchar(255) NOT NULL,
  `monto_servico` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_equipo`
--

CREATE TABLE `tipo_equipo` (
  `id_tipo_equipo` varchar(11) NOT NULL,
  `nombre_equipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_persona`
--

CREATE TABLE `tipo_persona` (
  `id_tipo_persona` varchar(11) NOT NULL,
  `nombre_tipo_persona` varchar(45) NOT NULL,
  `descripcion_tipo_persona` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` varchar(11) NOT NULL,
  `id_rol` varchar(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `estado_usuario` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id_cita`),
  ADD KEY `dni_cliente` (`dni_cliente`,`dni_tecnico`),
  ADD KEY `dni_tecnico` (`dni_tecnico`);

--
-- Indices de la tabla `detalle_trabajo`
--
ALTER TABLE `detalle_trabajo`
  ADD KEY `id_servicio` (`id_servicio`),
  ADD KEY `id_pieza` (`id_pieza`),
  ADD KEY `id_hoja_trabajo` (`id_hoja_trabajo`);

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
  ADD KEY `id_tipo_equipo` (`id_tipo_equipo`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `hoja_presupuesto`
--
ALTER TABLE `hoja_presupuesto`
  ADD PRIMARY KEY (`id_presupuesto`);

--
-- Indices de la tabla `hoja_trabajo`
--
ALTER TABLE `hoja_trabajo`
  ADD PRIMARY KEY (`id_hoja_trabajo`),
  ADD KEY `id_presupuesto` (`id_presupuesto`),
  ADD KEY `dni_tecnico` (`dni_tecnico`,`dni_cliente`),
  ADD KEY `dni_cliente` (`dni_cliente`);

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
  ADD KEY `id_distrito` (`id_distrito`),
  ADD KEY `id_horario` (`id_horario`),
  ADD KEY `id_tipo_persona` (`id_tipo_persona`);

--
-- Indices de la tabla `piezas`
--
ALTER TABLE `piezas`
  ADD PRIMARY KEY (`id_pieza`);

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
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `id_rol` (`id_rol`),
  ADD KEY `dni` (`dni`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`dni_cliente`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE,
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`dni_tecnico`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_trabajo`
--
ALTER TABLE `detalle_trabajo`
  ADD CONSTRAINT `detalle_trabajo_ibfk_1` FOREIGN KEY (`id_hoja_trabajo`) REFERENCES `hoja_trabajo` (`id_hoja_trabajo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_trabajo_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicios` (`id_servicio`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_trabajo_ibfk_3` FOREIGN KEY (`id_pieza`) REFERENCES `piezas` (`id_pieza`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`id_tipo_equipo`) REFERENCES `tipo_equipo` (`id_tipo_equipo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `hoja_trabajo`
--
ALTER TABLE `hoja_trabajo`
  ADD CONSTRAINT `hoja_trabajo_ibfk_2` FOREIGN KEY (`id_presupuesto`) REFERENCES `hoja_presupuesto` (`id_presupuesto`) ON UPDATE CASCADE,
  ADD CONSTRAINT `hoja_trabajo_ibfk_3` FOREIGN KEY (`dni_tecnico`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE,
  ADD CONSTRAINT `hoja_trabajo_ibfk_4` FOREIGN KEY (`dni_cliente`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`id_tipo_persona`) REFERENCES `tipo_persona` (`id_tipo_persona`) ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_ibfk_3` FOREIGN KEY (`id_distrito`) REFERENCES `distritos` (`id_distrito`) ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_ibfk_6` FOREIGN KEY (`id_horario`) REFERENCES `horarios` (`id_horario`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`) ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
