## Description

A few examples using [Mule ESB](https://www.mulesoft.com/resources/esb/what-mule-esb).

* _choice_db_: uses `choice` and `database` components to display database entries.
* _credit_card_validation_: rudimentary credit card validation using `choice` and Java classes.
* _email_: sends and email from a form.
* _email_attachment_: sends an email with attachment.
* _hello_world_: prints many hello messages by accessing the browser through many endpoints.
* _save_to_db_: saves a persistent purchase order in a MySQL database.
* _scatter_gather_: uses `scatter-gather` component to break flow into two threads.
* _ws_cep_: uses `HTTP` component to perform a _GET_ request to a REST web service.
* _ws_soap_: uses `Web Service Consumer` component to make a request to a SOAP web service.

----

#### Personal Notes

* `hello_world` is the example 1, 2 and 3 from class.
* `save_to_db` is the example 5 from class.
* `email` and `email_attachments` require access to a SMTP server.
* `ws_cep` and `ws_soap` require access to the correspondent REST and SOAP services. These are not made available in this project and serve only as examples of how to use the components.