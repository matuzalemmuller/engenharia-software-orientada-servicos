## Description

Request a SOAP service to save details about a sample order using [Mule ESB](https://www.mulesoft.com/resources/esb/what-mule-esb).

## Requests supported

* GET /

## Notes

* SOAP service code is available on [StarkSystem-eclipse](../../final-project/services/StarkSystem-eclipse).
* To create the database used by the SOAP service:
    ```
    CREATE SCHEMA `StarkSystem` ;
    CREATE TABLE StarkSystem.PEDIDOS  ( 
        CODIGO  	INT NOT NULL AUTO_INCREMENT,
        CLIENTE 	VARCHAR(40),
        ENDERECO	VARCHAR(100),
        ESTADO  	VARCHAR(10),
        QTD_REATOR_SOLAR INTEGER NOT NULL,
        QTD_REATOR_ARK INTEGER NOT NULL,
        TOTAL_REATOR_SOLAR   	REAL NOT NULL,
        TOTAL_REATOR_ARK   	REAL NOT NULL,
        TOTAL   	REAL,
        PRIMARY KEY(CODIGO)
    )
    ```