#Autor: Brandon Duque
Feature: Registro de un usuario en el portal web de Utest
  como un usuario
  quiero registrarme en el portal web
  para tener una cuenta personal de Utest

  Scenario: registro exitoso de un usuario nuevo
    Given que usuario ingresa a la pagina web de Utest
    When cuando intenta registrarse con los datos

      | firstName  | Brandon                 |
      | lastName   | Duque                   |
      | email      | eheaneyz_c32b@bylup.com |
      | birthMonth | June                    |
      | birthDay   | 20                      |
      | birthYear  | 1994                    |
      | password   | 123456789@BeliveInLove. |