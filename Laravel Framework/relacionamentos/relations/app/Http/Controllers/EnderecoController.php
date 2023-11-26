<?php

namespace App\Http\Controllers;

use App\Models\Endereco;
use Illuminate\Http\Request;

class EnderecoController extends Controller
{
    public function index()
    {
        return json_encode([
            'data' => Endereco::all(),
        ]);
    }
    public function show(Endereco $endereco)
    {
        return json_encode([
            'data' => $endereco,
        ]);
    }
    public function store(Request $request)
    {
        $endereco = new Endereco();
        $endereco->rua = $request->rua;
        $endereco->bairro = $request->bairro;
        $endereco->save();
    }
}
