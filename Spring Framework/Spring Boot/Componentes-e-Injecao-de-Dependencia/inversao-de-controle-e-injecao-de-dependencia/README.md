# Inversão de Controle - IoC

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH1_PIIJbnDo01lQJY7YoaO_MrmSwxF-p7UGDimG6S94oSaKAD9FjUM9vGYgsMJj1Q7wY&usqp=CAU" />

A `inversão de controle` é a `mudança` de `conhecimento` que uma `classe` tem em relação a outra

## Analogia do carro

<img src="https://s2-g1.glbimg.com/eY2wMrrCxB2xwVna6rciXmAFImI=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2019/f/L/SmloxRT6q89Rm4IvF7Vw/baterias-heliar.jpg" />

-   No carro, o `motor` depende da `bateria`
-   Porém, a `base de encaixe` da `bateria` é fora do `motor`

**_"Por que não colocar a base de encaixe dentro do motor?"_**

**Porque caso seja necessário trocar a bateria, não é preciso abrir o motor.**

Isso quer dizer que o `motor` `não` tem `nada haver` com a `bateria`, ele se quer sabe que ela existe.

## Contextualizando

- Se um componente `A` depende de `B`,  `A` NÃO deve ter controle sobre essa dependência.
		Ou seja, se for preciso mudar o `B` não será preciso mudar o `A`.
- É preciso `trocar o controle`.
		Ou seja, o controle da dependência deve ficar fora do `A`

## Controle Errado

Se um componente `A` depende de `B`, a NÃO deve ter de quem será essa dependência.

```java
public class SalaryService {
	private TaxService taxService = new TaxService(); 
	
```
 É errado colocar o `new TaxService`dentro do `SalaryService`, pois se for necessário trocar o `new` é preciso abrir o `SalaryService`.

O `TaxService` é a `bateria` e o `SalaryService` é o `carro`.

## Controle Certo
```java
public class SalaryService {
	private TaxService taxService; 
	
```

# Injeção de Dependência - DI

<img src="https://dkrn4sk0rn31v.cloudfront.net/uploads/2021/05/inje--o.jpg" />

Uma vez que o sistema usa o principio da `inversão de controle`, quando um componente `A` depende do componente `B` , essa dependência precisa ser `injetada`.

### Injeção por Construtor

Esse tipo de `injeção de dependência` é comumente usado, basicamente vamos receber no construtor a instancia da classe que queremos `injetar`.

```java
public class SalaryService {

	private TaxService taxService;

	public SalaryService(TaxService taxService) {
		this.taxService = taxService;
	}
}
```

**Bem melhor, não é?**

### Injeção por Método Set

Basicamente vamos criar um `método set` que irá receber a instancia da classe que queremos `injetar`.

```java
public class SalaryService {

	private TaxService taxService;

	public setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
}
```

### Injeção por Contêiner - Framework

O `Spring Boot` implementa injeção de dependências através de um contêiner chamado `Spring IoC Container`.

Esse `contêiner` é responsável por `gerenciar` todas as dependências do projeto de forma `automática`

- #### Beans		

	Os objetos gerenciados pelo `contêiner` do `Spring` são chamados de `Beans`.
	Uma aplicação rodando pode ter vários `beans`.

	 A forma mais comum de `declarar um bean` é usando a notação `@Component`.

- #### Declarando Bean

	```java
	@Component
	public class TaxService {
		//metodos legais
	}
	```
- #### Injeção

	Para a `injeção de dependência` utilizaremos a notação `@Autowired`.
	
	```java
	@Service
	public class SalaryService {
	
		@Autowired
		private TaxService taxService;
		
		//metodos legais
	}
	```