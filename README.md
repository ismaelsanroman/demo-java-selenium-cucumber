# 🧪 Demo Automation Testing con Java, Selenium y Cucumber

## 📌 Descripción
Este proyecto automatiza la interacción con la página [DemoQA](https://demoqa.com/) utilizando **Selenium**, **Cucumber (BDD con Java)** y **TestNG**. La automatización permite validar el flujo de entrada de datos en el formulario "Text Box".

---

## 🚀 Tecnologías utilizadas

🔹 **Java** (Lenguaje principal)  
🔹 **Selenium WebDriver** (Automatización del navegador)  
🔹 **Cucumber** (Framework BDD)  
🔹 **TestNG** (Ejecución de pruebas)  
🔹 **WebDriver Manager** (Manejo de drivers de Selenium)  
🔹 **Gradle** (Gestión de dependencias y compilación)  

---

## 📂 Estructura del proyecto
```
📦 demo-java-selenium-cucumber
├── 📂 build                 # Carpeta de salida de compilación
├── 📂 gradle                # Wrapper de Gradle
├── 📂 src/test/java
│   ├── 📂 pages              # Implementación del Page Object Model (POM)
│   │   ├── BasePage.java
│   │   ├── TextBoxPage.java
│   ├── 📂 runners            # Runner para ejecutar las pruebas con TestNG
│   │   ├── TestRunner.java
│   ├── 📂 steps              # Definición de los step definitions para Cucumber
│   │   ├── TextBoxSteps.java
│   ├── 📂 utils              # Clases de utilidad (Gestión del WebDriver)
│   │   ├── DriverManager.java
├── 📂 src/test/resources
│   ├── 📂 feature            # Escenarios de prueba en Gherkin
│   │   ├── demoqa_textbox.feature
├── build.gradle              # 📦 Dependencias y configuración del proyecto
├── gradle.properties         # Propiedades adicionales de Gradle
├── gradlew                   # Wrapper de Gradle para sistemas Unix
├── gradlew.bat               # Wrapper de Gradle para Windows
├── README.md                 # 📖 Documentación del proyecto
├── settings.gradle           # Configuración de Gradle
```

---

## ⚙️ Instalación y configuración

### 🔹 1. Clonar el repositorio
```sh
git clone https://github.com/ismaelsanroman/demo-java-selenium-cucumber.git
cd demo-java-selenium-cucumber
```

### 🔹 2. Construir el proyecto con Gradle
```sh
./gradlew build   # Linux/Mac
gradlew.bat build # Windows
```

---

## 🏃‍♂️ Ejecución de las pruebas

### 🔹 1. Ejecutar las pruebas con Cucumber y TestNG
```sh
./gradlew test   # Linux/Mac
gradlew.bat test # Windows
```
Los resultados de las pruebas se guardarán en `target/cucumber-reports.html`.

---

## ✨ Ejemplo de Escenario

Archivo: **`src/test/resources/feature/demoqa_textbox.feature`**
```gherkin
Feature: Rellenamos el formulario de TextBox

  Scenario: Rellenamos el formulario de TextBox
    Given el usuario está en la página de "https://demoqa.com/"
    And clicamos sobre el apartado "Elements"
    And nos dirigimos a "Text Box"
    When interactúa con el formulario de registro
      | full_name       | email              | current_address  | permanent_address |
      | Ismael Sanromán | isanroman@sdet.com | Calle SDET, 1    | Calle prueba, 2   |
    Then el formulario es enviado correctamente
```

---

## 📌 Notas importantes

1️⃣ **Drivers de Selenium:**  
   WebDriver Manager se encarga automáticamente de los drivers. No es necesario descargarlos manualmente.

2️⃣ **Reportes:**  
   Los reportes en HTML se generan automáticamente en `target/cucumber-reports.html`.

3️⃣ **Configuración de Gradle:**  
   Si es la primera vez que usas **Gradle Wrapper**, es posible que requiera descargar dependencias. Esto se maneja automáticamente en la primera ejecución.

---

## 📌 Contacto
[📧 Email:](mailto:ismaelsanromansanchez@gmail.com)  
[🐙 GitHub:](https://github.com/ismaelsanroman)  

