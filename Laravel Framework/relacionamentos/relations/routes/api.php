<?php

use App\Http\Controllers\EnderecoController;
use App\Http\Controllers\UsuarioController;
use Illuminate\Support\Facades\Route;

Route::group(['prefix' => 'usuarios'], function () {
    Route::controller(UsuarioController::class)->group(function () {
        Route::get('/', 'index');
        Route::post('/', 'store');
        Route::get('/{usuario}', 'show');
    });
});

Route::group(['prefix' => 'enderecos'], function () {
    Route::controller(EnderecoController::class)->group(function () {
        Route::get('/', 'index');
        Route::post('/', 'store');
        Route::get('/{endereco}', 'show');
    });
});