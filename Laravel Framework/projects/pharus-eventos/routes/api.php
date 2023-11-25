<?php

use App\Http\Controllers\EventController;
use Illuminate\Support\Facades\Route;

Route::group(['prefix' => 'eventos', 'middleware' => 'EventTokenIsValid'], function () {
    Route::controller(EventController::class)->group(function () {
        Route::get('/', 'index');
        Route::get('/{id}', 'show');
        Route::post('/', 'store');
        Route::put('/{id}', 'update');
        Route::delete('/{id}', 'destroy');
    });
});
