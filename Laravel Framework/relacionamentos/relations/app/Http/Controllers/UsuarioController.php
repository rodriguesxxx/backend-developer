<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Usuario;

class UsuarioController extends Controller
{
    public function index()
    {
        return json_encode([
            'data' => Usuario::all(),
        ]);
    }
    public function show(Usuario $usuario)
    {
        return json_encode([
            'data' => $usuario,
            'enderecos' => $usuario->enderecos()->get(),
            
        ]);
    }
    public function store(Request $request)
    {
        $usuario = new Usuario();
        $usuario->nome = $request->nome;
        $usuario->email = $request->email;
        $usuario->endereco_id = $request->endereco_id;
        $usuario->save();
    }
}
