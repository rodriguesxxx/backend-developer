## Criando Primeiro Projeto

- ### Utilizando composer
    Acesse terminal e execute o seguinte comando

        composer create-project laravel/laravel <project-name>

## Criando Primeiro Controller
    php artisan make:controller <NameController>


### Metodos do controller
```php
     public function primeiro_metodo_controlador(){
        return "Hello  world";
    }

    //recebe um valor de uma rota e manda pra view
    public function welcome(Request $request){
        $data = [
            "name" => $request->name
        ];
        return view("welcome", $data);
    }
```

## Criando a primeiro rota
```php
Route::get("/", [PharusController::class, "home"]); //redireciona para o metodo home do nosso controller

Route::get("/welcome/{name}",  [PharusController::class,"welcome"]); //recebe um nome como parametro e passa para o metodo welcome
```