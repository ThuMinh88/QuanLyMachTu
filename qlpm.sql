-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: qlpm
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ho` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `namsinh` datetime NOT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diachi` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chucvu` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bangcap` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `kinhnghiem` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_admin_taikhoan` FOREIGN KEY (`id`) REFERENCES `taikhoan` (`idTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bacsi`
--

DROP TABLE IF EXISTS `bacsi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bacsi` (
  `idBS` int NOT NULL AUTO_INCREMENT,
  `ho` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `namsinh` datetime NOT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diachi` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chucvu` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bangcap` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `kinhnghiem` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idBS`),
  CONSTRAINT `fk_bacsi_taikhhoan` FOREIGN KEY (`idBS`) REFERENCES `taikhoan` (`idTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bacsi`
--

LOCK TABLES `bacsi` WRITE;
/*!40000 ALTER TABLE `bacsi` DISABLE KEYS */;
/*!40000 ALTER TABLE `bacsi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baocao`
--

DROP TABLE IF EXISTS `baocao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `baocao` (
  `idBC` int NOT NULL AUTO_INCREMENT,
  `tenBC` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idQL` int NOT NULL,
  `ngaylapBC` datetime NOT NULL,
  `noidung` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`idBC`),
  KEY `fk_baocao_admin_idx` (`idQL`),
  CONSTRAINT `fk_baocao_admin` FOREIGN KEY (`idQL`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baocao`
--

LOCK TABLES `baocao` WRITE;
/*!40000 ALTER TABLE `baocao` DISABLE KEYS */;
/*!40000 ALTER TABLE `baocao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `benhnhan`
--

DROP TABLE IF EXISTS `benhnhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benhnhan` (
  `idBN` int NOT NULL AUTO_INCREMENT,
  `hoBN` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenBN` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `sodienthoai` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `gioitinh` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `namsinh` datetime NOT NULL,
  `anhdaidien` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `benhan` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idBN`),
  CONSTRAINT `fk_benhnhan_taikhoan` FOREIGN KEY (`idBN`) REFERENCES `taikhoan` (`idTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benhnhan`
--

LOCK TABLES `benhnhan` WRITE;
/*!40000 ALTER TABLE `benhnhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `benhnhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietdonthuoc`
--

DROP TABLE IF EXISTS `chitietdonthuoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonthuoc` (
  `idDT` int NOT NULL,
  `idthuoc` int NOT NULL,
  `soluong` int NOT NULL,
  `dongia` decimal(10,0) NOT NULL,
  `thanhtien` decimal(10,0) NOT NULL,
  KEY `fk_chitietdonthuoc_donthuoc_idx` (`idDT`),
  KEY `fk_chitietdonthuoc_thuoc_idx` (`idthuoc`),
  CONSTRAINT `fk_chitietdonthuoc_donthuoc` FOREIGN KEY (`idDT`) REFERENCES `donthuoc` (`idDT`),
  CONSTRAINT `fk_chitietdonthuoc_thuoc` FOREIGN KEY (`idthuoc`) REFERENCES `thuoc` (`idthuoc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonthuoc`
--

LOCK TABLES `chitietdonthuoc` WRITE;
/*!40000 ALTER TABLE `chitietdonthuoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitietdonthuoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhmucthuoc`
--

DROP TABLE IF EXISTS `danhmucthuoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhmucthuoc` (
  `idDM` int NOT NULL AUTO_INCREMENT,
  `tenDM` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mota` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idDM`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhmucthuoc`
--

LOCK TABLES `danhmucthuoc` WRITE;
/*!40000 ALTER TABLE `danhmucthuoc` DISABLE KEYS */;
INSERT INTO `danhmucthuoc` VALUES (1,'Thuốc tiêu hóa','Chuyên trị các bệnh về hệ tiêu hóa'),(2,'Thuốc cảm lạnh, ho','Điều trị các loại ho khác nhau'),(3,'Thuốc da liễu','Chuyên trị các bệnh về da'),(4,'Thuốc thần kinh','Chuyên trị các bệnh liên quan đến hệ thần kin'),(5,'Thuốc cơ xương khớp','Chuyên trị các bệnh về xương khớp'),(6,'Thuốc hệ hô hấp','Dùng cho một số trường hợp liên quan đến hô h');
/*!40000 ALTER TABLE `danhmucthuoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donthuoc`
--

DROP TABLE IF EXISTS `donthuoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donthuoc` (
  `idDT` int NOT NULL AUTO_INCREMENT,
  `idBS` int NOT NULL,
  `idBN` int NOT NULL,
  `ghichu` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idDT`),
  KEY `fk_donthuoc_benhnhan_idx` (`idBN`),
  KEY `fk_donthuoc_bacsi_idx` (`idBS`),
  CONSTRAINT `fk_donthuoc_bacsi` FOREIGN KEY (`idBS`) REFERENCES `bacsi` (`idBS`),
  CONSTRAINT `fk_donthuoc_benhnhan` FOREIGN KEY (`idBN`) REFERENCES `benhnhan` (`idBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donthuoc`
--

LOCK TABLES `donthuoc` WRITE;
/*!40000 ALTER TABLE `donthuoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `donthuoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `idHD` int NOT NULL AUTO_INCREMENT,
  `idnguoiTT` int NOT NULL,
  `idnhanvienTT` int NOT NULL,
  `hinhthucTT` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tongTT` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idHD`),
  KEY `fk_hoadon_benhnhan_idx` (`idnguoiTT`),
  KEY `fk_hoadon_yta_idx` (`idnhanvienTT`),
  CONSTRAINT `fk_hoadon_benhnhan` FOREIGN KEY (`idnguoiTT`) REFERENCES `benhnhan` (`idBN`),
  CONSTRAINT `fk_hoadon_yta` FOREIGN KEY (`idnhanvienTT`) REFERENCES `yta` (`idYT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaitaikhoan`
--

DROP TABLE IF EXISTS `loaitaikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaitaikhoan` (
  `idLoaiTK` int NOT NULL AUTO_INCREMENT,
  `tenloaiTK` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`idLoaiTK`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaitaikhoan`
--

LOCK TABLES `loaitaikhoan` WRITE;
/*!40000 ALTER TABLE `loaitaikhoan` DISABLE KEYS */;
INSERT INTO `loaitaikhoan` VALUES (1,'Admin'),(2,'Bác Sĩ'),(3,'Y Tá'),(4,'Bệnh Nhân');
/*!40000 ALTER TABLE `loaitaikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhacungcap` (
  `idNCC` int NOT NULL AUTO_INCREMENT,
  `tenNCC` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`idNCC`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhacungcap`
--

LOCK TABLES `nhacungcap` WRITE;
/*!40000 ALTER TABLE `nhacungcap` DISABLE KEYS */;
INSERT INTO `nhacungcap` VALUES (1,'Công ty TNHH Lê Hào'),(2,'Công ty Cổ Phần Difoco'),(3,'Công ty Cổ Phần Dưỡng Dược Vĩnh Kim'),(4,'Doanh Nghiệp Tư Nhân Trọng Đức'),(5,'Công ty Cổ Phần Công Nghệ Cao Thăng Long');
/*!40000 ALTER TABLE `nhacungcap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieukhambenh`
--

DROP TABLE IF EXISTS `phieukhambenh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieukhambenh` (
  `idphieuKB` int NOT NULL AUTO_INCREMENT,
  `idBN` int NOT NULL,
  `idBS` int NOT NULL,
  `ngaykham` datetime NOT NULL,
  PRIMARY KEY (`idphieuKB`),
  CONSTRAINT `fk_phieukb_basi` FOREIGN KEY (`idphieuKB`) REFERENCES `bacsi` (`idBS`),
  CONSTRAINT `fk_phieukb_benhnhan` FOREIGN KEY (`idphieuKB`) REFERENCES `benhnhan` (`idBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieukhambenh`
--

LOCK TABLES `phieukhambenh` WRITE;
/*!40000 ALTER TABLE `phieukhambenh` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieukhambenh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `idTK` int NOT NULL,
  `username` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idLoaiTK` int NOT NULL,
  PRIMARY KEY (`idTK`),
  KEY `fkTaiKhoan_LoaiTK_idx` (`idLoaiTK`),
  CONSTRAINT `fkTaiKhoan_LoaiTK` FOREIGN KEY (`idLoaiTK`) REFERENCES `loaitaikhoan` (`idLoaiTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thuoc`
--

DROP TABLE IF EXISTS `thuoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thuoc` (
  `idthuoc` int NOT NULL AUTO_INCREMENT,
  `tenthuoc` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `soluong` decimal(10,0) NOT NULL,
  `hansudung` date NOT NULL,
  `giaban` decimal(10,0) NOT NULL,
  `mota` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `idDMT` int NOT NULL,
  `idNCC` int NOT NULL,
  PRIMARY KEY (`idthuoc`),
  KEY `fk_thuoc_danhmucthuoc_idx` (`idDMT`),
  KEY `fk_thuoc_nhacc_idx` (`idNCC`),
  CONSTRAINT `fk_thuoc_danhmucthuoc` FOREIGN KEY (`idDMT`) REFERENCES `danhmucthuoc` (`idDM`),
  CONSTRAINT `fk_thuoc_nhacc` FOREIGN KEY (`idNCC`) REFERENCES `nhacungcap` (`idNCC`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thuoc`
--

LOCK TABLES `thuoc` WRITE;
/*!40000 ALTER TABLE `thuoc` DISABLE KEYS */;
INSERT INTO `thuoc` VALUES (28,'Astodil 10g',1000,'2050-12-10',100000,'thuốc về bệnh hô hấp',6,1),(29,'Atilair Sac',1500,'2050-12-10',99000,'thuốc về bệnh hô hấp',6,1),(30,'Atisalbu',1000,'2050-12-10',100000,'thuốc về bệnh hô hấp',6,1),(31,'Agidecotyl 250mg',100,'2050-12-10',15000,'thuốc về bệnh xương khớp',5,4),(32,'Agidecotyl 500mg',500,'2050-12-10',50000,'thuốc về bệnh xương khớp',5,5),(33,'Agihistine 16mg',500,'2050-12-10',200000,'thuốc về bệnh thần kinh',4,5),(34,'Agibiro 20mg',600,'2050-12-10',500000,'thuốc về bệnh thần kinh',4,5),(35,'Acnotin 20',500,'2050-12-10',20000,'thuốc về bệnh da liễu',3,2),(36,'Candid TV(60ml)',500,'2050-12-10',45000,'thuốc về bệnh da liễu',3,5),(37,'Dorocodon',500,'2050-12-10',20000,'thuốc về ho, cảm lạnh',2,3),(38,'Hapacol CF',5100,'2050-12-10',30000,'thuốc về ho, cảm lạnh',2,2),(39,'Alcomet',500,'2050-12-10',20000,'thuốc về hệ tiêu hóa',1,3),(40,'Carsil 90',500,'2050-12-10',20000,'thuốc về hệ tiêu hóa',1,1);
/*!40000 ALTER TABLE `thuoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yta`
--

DROP TABLE IF EXISTS `yta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `yta` (
  `idYT` int NOT NULL AUTO_INCREMENT,
  `ho` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `namsinh` datetime NOT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diachi` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bangcap` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chucvu` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `kinhnghiem` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idYT`),
  CONSTRAINT `fk_yta_taikhoan` FOREIGN KEY (`idYT`) REFERENCES `taikhoan` (`idTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yta`
--

LOCK TABLES `yta` WRITE;
/*!40000 ALTER TABLE `yta` DISABLE KEYS */;
/*!40000 ALTER TABLE `yta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-08 10:30:57