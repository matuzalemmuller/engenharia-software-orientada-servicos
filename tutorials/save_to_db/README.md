## Description

Saving an example purchase in a MySQL database using [Mule ESB](https://www.mulesoft.com/resources/esb/what-mule-esb).

## Requests supported

* GET /

## Notes

* Before running the code, it is necessary to create the MySQL table:
    ```
    CREATE SCHEMA `NewTec` ;
    CREATE TABLE NewTec.PEDIDOS  ( 
        CODIGO  	INT NOT NULL AUTO_INCREMENT,
        CLIENTE 	VARCHAR(40) NOT NULL,
        ENDERECO	VARCHAR(100) NOT NULL,
        ESTADO  	VARCHAR(10) NOT NULL,
        QTD_ROBO_DOMESTICO INTEGER NOT NULL,
        QTD_REATOR_SOLAR INTEGER NOT NULL,
        QTD_REATOR_ARK INTEGER NOT NULL,	
        TOTAL   	REAL NOT NULL,
        PRIMARY KEY(CODIGO)
    )
    ```
    * The username and the password of the database are defined in the `src/main/java/br/ufsc/das/Dao.java` file.