-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Jul-2018 às 09:25
-- Versão do servidor: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clcmo_sis_clinica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ag_consulta`
--

CREATE TABLE `ag_consulta` (
  `id_con` int(11) NOT NULL,
  `id_pac` int(11) DEFAULT NULL,
  `id_med` int(11) DEFAULT NULL,
  `data_con` date DEFAULT NULL,
  `data_ag` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ag_exame`
--

CREATE TABLE `ag_exame` (
  `id_exa` int(11) NOT NULL,
  `id_pac` int(11) DEFAULT NULL,
  `id_med` int(11) DEFAULT NULL,
  `data_exa` date DEFAULT NULL,
  `data_ag` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `enc_mat`
--

CREATE TABLE `enc_mat` (
  `id_mat` int(11) NOT NULL,
  `id_med` int(11) NOT NULL,
  `data_uso_desc` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `especialidade`
--

CREATE TABLE `especialidade` (
  `id_esp` int(11) NOT NULL,
  `especialidade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_fun` int(11) NOT NULL,
  `nome` varchar(150) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `material`
--

CREATE TABLE `material` (
  `id_mat` int(11) NOT NULL,
  `material` varchar(50) DEFAULT NULL,
  `data_com` varchar(10) DEFAULT NULL,
  `data_val` varchar(10) DEFAULT NULL,
  `id_tipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `medico`
--

CREATE TABLE `medico` (
  `id_med` int(11) NOT NULL,
  `crm` int(10) NOT NULL,
  `id_fun` int(11) DEFAULT NULL,
  `id_esp` int(11) DEFAULT NULL,
  `data_emi` date DEFAULT NULL,
  `data_val` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Stand-in structure for view `med_fun`
-- (See below for the actual view)
--
CREATE TABLE `med_fun` (
`crm` int(10)
,`nome` varchar(150)
);

-- --------------------------------------------------------

--
-- Estrutura da tabela `met_pag`
--

CREATE TABLE `met_pag` (
  `id_met` int(11) NOT NULL,
  `met_pag` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE `paciente` (
  `id_pac` int(11) NOT NULL,
  `nome` varchar(150) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `rea_consulta`
--

CREATE TABLE `rea_consulta` (
  `id_con` int(11) NOT NULL,
  `id_pac` int(11) NOT NULL,
  `id_met` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `rea_exame`
--

CREATE TABLE `rea_exame` (
  `id_exa` int(11) NOT NULL,
  `id_pac` int(11) NOT NULL,
  `id_met` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_material`
--

CREATE TABLE `tipo_material` (
  `id_tipo` int(11) NOT NULL,
  `tipo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure for view `med_fun`
--
DROP TABLE IF EXISTS `med_fun`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `med_fun`  AS  select `medico`.`crm` AS `crm`,`funcionario`.`nome` AS `nome` from (`medico` join `funcionario`) where (`medico`.`id_fun` = `funcionario`.`id_fun`) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ag_consulta`
--
ALTER TABLE `ag_consulta`
  ADD PRIMARY KEY (`id_con`),
  ADD KEY `id_pac` (`id_pac`),
  ADD KEY `id_med` (`id_med`);

--
-- Indexes for table `ag_exame`
--
ALTER TABLE `ag_exame`
  ADD PRIMARY KEY (`id_exa`),
  ADD KEY `id_pac` (`id_pac`),
  ADD KEY `id_med` (`id_med`);

--
-- Indexes for table `enc_mat`
--
ALTER TABLE `enc_mat`
  ADD KEY `id_mat` (`id_mat`),
  ADD KEY `id_med` (`id_med`);

--
-- Indexes for table `especialidade`
--
ALTER TABLE `especialidade`
  ADD PRIMARY KEY (`id_esp`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_fun`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`id_mat`),
  ADD KEY `id_tipo` (`id_tipo`);

--
-- Indexes for table `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id_med`),
  ADD KEY `id_fun` (`id_fun`),
  ADD KEY `id_esp` (`id_esp`);

--
-- Indexes for table `met_pag`
--
ALTER TABLE `met_pag`
  ADD PRIMARY KEY (`id_met`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_pac`);

--
-- Indexes for table `rea_consulta`
--
ALTER TABLE `rea_consulta`
  ADD KEY `id_con` (`id_con`),
  ADD KEY `id_pac` (`id_pac`),
  ADD KEY `id_met` (`id_met`);

--
-- Indexes for table `rea_exame`
--
ALTER TABLE `rea_exame`
  ADD KEY `id_exa` (`id_exa`),
  ADD KEY `id_pac` (`id_pac`),
  ADD KEY `id_met` (`id_met`);

--
-- Indexes for table `tipo_material`
--
ALTER TABLE `tipo_material`
  ADD PRIMARY KEY (`id_tipo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ag_consulta`
--
ALTER TABLE `ag_consulta`
  MODIFY `id_con` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ag_exame`
--
ALTER TABLE `ag_exame`
  MODIFY `id_exa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `especialidade`
--
ALTER TABLE `especialidade`
  MODIFY `id_esp` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_fun` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `id_mat` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `met_pag`
--
ALTER TABLE `met_pag`
  MODIFY `id_met` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_pac` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipo_material`
--
ALTER TABLE `tipo_material`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
