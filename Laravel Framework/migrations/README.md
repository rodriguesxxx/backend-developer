## Pra que serve as migrations?

## Princiapais comandos

**CRIANDO MIGRATION**
```bash
php artisan make:migration create_events_table
```

**DELETANDO DADOS DA MIGRATION**

```bash
php artisan migrate:rollback
```

**ATUALIZANDO DADOS DA MIGRATION**

Para alterar um tabela(ou qualquer outro dado), devemos criar uma nova migration

```bash
php artisan make:migration alter_events_table
```
exemplo de codigo:
```php
<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        //seleciona a tabela events
        Schema::table('events', function (Blueprint $table){
            $table->integer('author_id')->after('description'); //adiona uma nova coluna logo após a coluna "description"
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        //seleciona a tabela events
        Schema::table('events', function (Blueprint $table){
            $table->dropColumn('author_id'); //apaga a coluna
        });
    }
};

```