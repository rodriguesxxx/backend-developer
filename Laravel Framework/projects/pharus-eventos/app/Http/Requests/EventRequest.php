<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class EventRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array<mixed>|string>
     */
    public function rules(): array
    {
        return [
            'title' => 'required|string',
            'description' => 'required|string',
            'initial_date' => 'required|date',
            'final_date' => 'required|date',
        ];
    }

    public function messages(): array{
        return [
            'title.required'=> 'O titulo do evento é obrigatorio',
            'description.required'=> 'A descricao do evento é obrigatorio',
            'initial_date.required'=> 'A data inical do evento é obrigatorio',
            'final_date.required'=> 'A data final do evento é obrigatorio',
        ];
    }
}
