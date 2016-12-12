IF OBJECT_ID('tISB_PledgeNotifications') IS NOT NULL DROP TABLE tISB_PledgeNotifications
GO

CREATE TABLE tISB_PledgeNotifications
(
 NotificationId         UNIQUEIDENTIFIER    NOT NULL
,DocumentAndSignature   VARBINARY(MAX)      NOT NULL
,PackageId              UNIQUEIDENTIFIER    NOT NULL
,Uip                    VARCHAR(MAX)        NOT NULL
,DateSend               SMALLDATETIME       NULL
,RegistrationID         UNIQUEIDENTIFIER    NULL
,Code                   INT                 NULL
,Message                VARCHAR(MAX)        NULL
,UserName               VARCHAR(32)         NULL
)
GO

GRANT ALL ON tISB_PledgeNotifications TO PUBLIC
GO