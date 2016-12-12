USE [master]
GO
CREATE LOGIN [fciit_adapter] WITH PASSWORD=Npledges, DEFAULT_DATABASE=[minor_test], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO

USE [minor_test]
GO
CREATE USER [fciit_adapter] FOR LOGIN [fciit_adapter]
GO
