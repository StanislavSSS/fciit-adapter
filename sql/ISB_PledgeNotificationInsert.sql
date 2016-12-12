IF OBJECT_ID('ISB_PledgeNotificationInsert') IS NOT NULL DROP PROC ISB_PledgeNotificationInsert
GO

CREATE PROC ISB_PledgeNotificationInsert (@NotificationId         UNIQUEIDENTIFIER    
                                         ,@DocumentAndSignature   VARBINARY(MAX)      
                                         ,@PackageId              UNIQUEIDENTIFIER    
                                         ,@Uip                    VARCHAR(MAX)        
                                         ,@DateSend               SMALLDATETIME       
                                         ,@RegistrationID         UNIQUEIDENTIFIER    
                                         ,@Code                   INT                 
                                         ,@Message                VARCHAR(MAX)        
                                         ,@UserName               VARCHAR(32)       
                                         )
AS
BEGIN
MERGE tISB_PledgeNotifications AS TARGET
USING (SELECT @NotificationId
             ,@DocumentAndSignature
             ,@PackageId           
             ,@Uip                 
             ,@DateSend
) AS SOURCE (NotificationID
            ,DocumentAndSignature
            ,PackageId   
            ,Uip         
            ,DateSend)
ON (TARGET.NotificationID = SOURCE.NotificationID)
WHEN NOT MATCHED THEN
INSERT (NotificationID
       ,DocumentAndSignature
       ,PackageId   
       ,Uip         
       ,DateSend)
VALUES (SOURCE.NotificationID
       ,SOURCE.DocumentAndSignature
       ,SOURCE.PackageId   
       ,SOURCE.Uip         
       ,SOURCE.DateSend);
END
GO

GRANT ALL on ISB_PledgeNotificationInsert TO public
GO