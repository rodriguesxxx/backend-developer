<?php

namespace App\Http\Controllers;

use App\Http\Requests\EventRequest;
use App\Models\Event;
use Illuminate\Http\Request;
use Symfony\Component\HttpKernel\Controller\ArgumentResolver\RequestPayloadValueResolver;

class EventController extends Controller
{
    public function index(){
        return Event::all();
    }
    
    public function show($id){
        return Event::find($id);
    }
    public function store(EventRequest $request){
        $data = $request->validated();
        return Event::create($data);
    }

    public function update(Request $request, $id){
        $data = $request->all();
        return Event::find($id)->update($data);
    }

    public function destroy($id){
        return Event::find($id)->delete();
    }

}
