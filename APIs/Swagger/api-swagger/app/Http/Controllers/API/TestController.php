<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;

/**
 * @OA\Info(
 *     title="Test Api",
 *     version="1.0",
 *     description="vsfd"
 * )
 */


class TestController extends Controller
{
    /**
     * @OA\Get(
     *     path="/test",
     *     summary="Esse é um test",
     *     description="So sei que nao sei de nada",
     *     @OA\Response(response="200", description="fds")
     * )
     */

    public function index()
    {
        return "Vai se foder";
    }
}
