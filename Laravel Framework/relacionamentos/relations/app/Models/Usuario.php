<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Usuario extends Model
{
    use HasFactory;
    protected $table = "usuarios";
    protected $fillable = [
        'nome',
        'email',
        'endereco_id'
    ];

    public function enderecos(){
        return $this->hasOne(Endereco::class, 'id', 'endereco_id');
    }
}
