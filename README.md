# Objetivo

Automação de testes com o Java, Selenium WebDriver e Cucumber utillizando Page Objects.

Objetivo é automatizar uma rotina de sucesso preenchendo os formulários de cotação de seguro no site http://sampleapp.tricentis.com/101/app.php

Para criação dos testes foi utilizado o Eclipse IDE, projeto com estrutura Maven.

## A estrutura do pacote de test é dividida em: 

* ***pageObjects***: Page Objects da página

* ***Runner***: Runner para rodar o Cucumber

* ***Steps***: Passos dos testes para preencher os formulários

* ***Utils***: Utilitário para data

## A estrutura do pacote de resources é dividida em: 

* ***Features***: Arquivo feature com cenário do teste utilizando Cucumber.
 
## Tecnologia utilizada 

- Java 8
- Java JDK 11
- Maven - Apache Maven 3.8.2
- Eclipse IDE - 2021-06 (4.20.0)
- Selenium - 3.141
- Cucumber - Puglin para Eclipse	v1.0.0.202107150747

**Observação:** O _ChromeDriver.exe_ disponibilizado na pasta _drivers_ é compatível com a Versão 101.0.4951.41 do navegador Chrome.




