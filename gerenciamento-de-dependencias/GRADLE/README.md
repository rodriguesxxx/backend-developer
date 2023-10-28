# O que é?

Gradle é um sistema de automacao e compilacao de builds,
ele pode gerar um JAR ou até mesmo um APK, sendo o executavel do seu app.

## O que o gradle é capaz de fazer?

- #### Ele pode fazer diversas tarefas antes e após do build.

- #### Rodar os unit tests do  projeto

- #### colocar o JAR ou o APK em uma pasta diferente da padrao

- #### gestao de dependencias do projeto( uma das principais )

- #### fazer o build com multiplos modulos

- #### gerar documentacao JAVADOC

- #### Assinar apks e aab no Android

## Principais caracteristicas

- #### Os scripts Gradle sáo escritos em Groovy

- #### Ele é baseado em tasks

- #### diversos plugins

- #### Open Source

## Gradlew

- ### Permite utilizar todas as funcionalidades do Gradle sem precisar instalar( meio quem uma Vm)

- ### Padroniza todas as configs do Gradle

## Instalacao do Gradle

### Nativo( para toda a maquina )
 É necessario ter o SDKMAN instalado
	
	sdk install gradle <version>


### A partir do gradlew(caso projeto tenha):
  Basta acessar o projeto que esta com gradlew configurado e rodar os seguintes coamandos.
 
  	./gradlew
	
	./gradlew --version

  Isso já baixa e configura o gradle(apenas para o projeto atual).






## Principais comandos

- --version ( verifica a versao do gradle)
- tasks (mostra as tasks do projeto)

## Gestao de dependencias

O gradle é capaz de gerenciar libs JARs.

As nossas depencias ficam dentro do arquivo build.gradle.

Vamos utilizar duas secoes desse arquivo, a **repositories {}** e a **dependencies {}**.

exemplo:

```groovy
	
	repositories{
	  
	  jcenter()
	
	}
	
	dependencies {
	  
	  implementation("com.google.guava:guava:30.1-jre")
	
 	}

```


## Build de projetos

### BuildScript

o arquivo build.gradle é chamado de BuildScript, ele define toda a configuracao da build
Ele é escrito utilizando uma DLS, pode ser em Groovy ou Kotlin.
Todas as tarefas são criadas dentro do build script, ou um plugin que tem essas tarefas. Como o application.

### Plugins


